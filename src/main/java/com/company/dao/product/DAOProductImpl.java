package com.company.dao.product;

import com.company.dao.DBWorker;
import com.company.dao.order.DAOOrderImpl;
import com.company.entity.Product;
import org.apache.logging.log4j.LogManager;
//import org.slf4j.Logger;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DAOProductImpl extends DBWorker implements DAOProduct {

    private Connection connection = getConnection();

    private static final Logger logger = LogManager.getLogger(DAOProductImpl.class);

    @Override
    public void addProduct(Product product) {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO PRODUCT (idProduct, name, model, description, cost) VALUES (?, ?, ?, ?, ?)";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getIdProduct());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getModel());
            preparedStatement.setString(4, product.getDescription());
            preparedStatement.setInt(5, product.getCost());

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
    }

    @Override
    public List<Product> getAllProducts() {
        String query = "select * from product";

        List<Product> products = new ArrayList<>();

        try {
            System.out.println("We're connected");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                Product product = new Product();

                product.setIdProduct(resultSet.getInt("idProduct"));
                product.setName(resultSet.getString("name"));
                product.setModel(resultSet.getString("model"));
                product.setDescription(resultSet.getString("description"));
                product.setCost(resultSet.getInt("cost"));

                products.add(product);
            }
            System.out.println(products);
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);

        return products;
    }

    @Override
    public Product getByIdProduct(int idProduct) {
        PreparedStatement preparedStatement = null;
        String sql = "SELECT idProduct, name, model, description, cost FROM product WHERE idProduct=?";
        Product product = new Product();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idProduct);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            product.setIdProduct(resultSet.getInt("idProduct"));
            product.setName(resultSet.getString("name"));
            product.setModel(resultSet.getString("model"));
            product.setDescription(resultSet.getString("description"));
            product.setCost(resultSet.getInt("cost"));
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);

        return product;
    }

    @Override
    public void updateProduct(Product product) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE PRODUCT SET name=?, model=?, description=?, cost=? WHERE idProduct=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getModel());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setInt(4, product.getCost());
            preparedStatement.setInt(5, product.getIdProduct());

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
    }

    @Override
    public void deleteProduct(int idProduct) {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM PRODUCT WHERE idProduct=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, idProduct);

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
    }
}