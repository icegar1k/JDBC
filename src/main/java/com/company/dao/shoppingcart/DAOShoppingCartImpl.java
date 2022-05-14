package com.company.dao.shoppingcart;

import com.company.dao.DBWorker;
import com.company.dao.order.DAOOrderImpl;
import com.company.entity.ShoppingCart;
import com.company.entity.User;
//import org.slf4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DAOShoppingCartImpl extends DBWorker implements DAOShoppingCart {

    private Connection connection = getConnection();

    private static final Logger logger = LogManager.getLogger(DAOShoppingCartImpl.class);

    @Override
    public void addShoppingCart(ShoppingCart shoppingCart) {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO SHOPPINGCART (idShoppingCart, idUser, idProduct, name, code, price, quantity, amount) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, shoppingCart.getIdShoppingCart());
            preparedStatement.setInt(2, shoppingCart.getIdUser());
            preparedStatement.setInt(3, shoppingCart.getIdProduct());
            preparedStatement.setString(4, shoppingCart.getName());
            preparedStatement.setString(5, shoppingCart.getCode());
            preparedStatement.setInt(6, shoppingCart.getPrice());
            preparedStatement.setInt(7, shoppingCart.getQuantity());
            preparedStatement.setInt(8, shoppingCart.getAmount());

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
    public List<ShoppingCart> getAllShoppingCarts() {
        String query = "select * from shoppingcart";

        List<ShoppingCart> shoppingCarts = new ArrayList<>();

        try {
            System.out.println("We're connected");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                ShoppingCart shoppingCart = new ShoppingCart();

                shoppingCart.setIdShoppingCart(resultSet.getInt("idShoppingCart"));
                shoppingCart.setIdUser(resultSet.getInt("idUser"));
                shoppingCart.setIdProduct(resultSet.getInt("idProduct"));
                shoppingCart.setName(resultSet.getString("name"));
                shoppingCart.setCode(resultSet.getString("code"));
                shoppingCart.setPrice(resultSet.getInt("price"));
                shoppingCart.setQuantity(resultSet.getInt("quantity"));
                shoppingCart.setAmount(resultSet.getInt("amount"));

                shoppingCarts.add(shoppingCart);
            }
            System.out.println(shoppingCarts);
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);

        return shoppingCarts;
    }

    @Override
    public ShoppingCart getByIdShoppingCart(int idShoppingCart) {
        PreparedStatement preparedStatement = null;
        String sql = "SELECT idShoppingCart, idUser, idProduct, name, code, price, quantity, amount FROM shoppingcart WHERE idShoppingCart=?";
        ShoppingCart shoppingCart = new ShoppingCart();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idShoppingCart);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            shoppingCart.setIdShoppingCart(resultSet.getInt("idShoppingCart"));
            shoppingCart.setIdUser(resultSet.getInt("idUser"));
            shoppingCart.setIdProduct(resultSet.getInt("idProduct"));
            shoppingCart.setName(resultSet.getString("name"));
            shoppingCart.setCode(resultSet.getString("code"));
            shoppingCart.setPrice(resultSet.getInt("price"));
            shoppingCart.setQuantity(resultSet.getInt("quantity"));
            shoppingCart.setAmount(resultSet.getInt("amount"));
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);

        return shoppingCart;
    }

    @Override
    public void updateShoppingCart(ShoppingCart shoppingCart) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE SHOPPINGCART SET idUser=?, idProduct=?, name=?, code=?, price=?, quantity=?, amount=? WHERE idShoppingCart=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);

            preparedStatement.setInt(1, shoppingCart.getIdUser());
            preparedStatement.setInt(2, shoppingCart.getIdProduct());
            preparedStatement.setString(3, shoppingCart.getName());
            preparedStatement.setString(4, shoppingCart.getCode());
            preparedStatement.setInt(5, shoppingCart.getPrice());
            preparedStatement.setInt(6, shoppingCart.getQuantity());
            preparedStatement.setInt(7, shoppingCart.getAmount());
            preparedStatement.setInt(8, shoppingCart.getIdShoppingCart());

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
    public void deleteShoppingCart(int idShoppingCart) {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM shoppingcart WHERE idShoppingCart=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, idShoppingCart);

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