package com.company.dao.shoppingcart;

import com.company.dao.DBWorker;
import com.company.dao.order.DAOOrderImpl;
import com.company.entity.ShoppingCart;
import com.company.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOShoppingCartImpl extends DBWorker implements DAOShoppingCart {

    private Connection connection = getConnection();

    private static final Logger logger = LoggerFactory.getLogger(DAOShoppingCartImpl.class);

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
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

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
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return shoppingCart;
    }

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
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
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
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
    }

    @Override
    public void update(ShoppingCart shoppingCart) {
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

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
    }
}