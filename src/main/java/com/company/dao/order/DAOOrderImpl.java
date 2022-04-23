package com.company.dao.order;

import com.company.dao.DBWorker;
import com.company.entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOOrderImpl extends DBWorker implements DAOOrder{

    private Connection connection = getConnection();

    private static final Logger logger = LoggerFactory.getLogger(DAOOrderImpl.class);

    @Override
    public List<Order> getAllOrders() {

        String query = "select * from shop.`order`";

        List<Order> orders = new ArrayList<>();

        try {
            System.out.println("We're connected");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                Order order = new Order();

                order.setIdOrder(resultSet.getInt("idOrder"));
                order.setIdUser(resultSet.getInt("idUser"));
                order.setIdProduct(resultSet.getInt("idProduct"));
                order.setIndex(resultSet.getInt("index"));
                order.setDateTime(resultSet.getString("dateTime"));
                order.setDeliveryAddress(resultSet.getString("deliveryAddress"));
                order.setAmount(resultSet.getInt("amount"));
                order.setStatus(resultSet.getString("status"));
                order.setReview(resultSet.getString("review"));

                orders.add(order);
            }
            System.out.println(orders);
        }
        catch (SQLException e)
        {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return orders;
    }

    @Override
    public Order getByIdOrder(int idOrder) {

        PreparedStatement preparedStatement = null;
        String sql = "SELECT * FROM shop.`order` WHERE idOrder=?";
        Order order = new Order();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idOrder);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            order.setIdOrder(resultSet.getInt("idOrder"));
            order.setIdUser(resultSet.getInt("idUser"));
            order.setIdProduct(resultSet.getInt("idProduct"));
            order.setIndex(resultSet.getInt("index"));
            order.setDateTime(resultSet.getString("dateTime"));
            order.setDeliveryAddress(resultSet.getString("deliveryAddress"));
            order.setAmount(resultSet.getInt("amount"));
            order.setStatus(resultSet.getString("status"));
            order.setReview(resultSet.getString("review"));
        }
        catch (SQLException e)
        {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return order;
    }

    @Override
    public void addOrder(Order order) {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO ORDER (idOrder, idUser, idProduct, index, dateTime, deliveryAddress, amount, status, review) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, order.getIdOrder());
            preparedStatement.setInt(2, order.getIdUser());
            preparedStatement.setInt(3, order.getIdProduct());
            preparedStatement.setInt(4, order.getIndex());
            preparedStatement.setString(5, order.getDateTime());
            preparedStatement.setString(6, order.getDeliveryAddress());
            preparedStatement.setInt(7, order.getAmount());
            preparedStatement.setString(8, order.getStatus());
            preparedStatement.setString(8, order.getReview());

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

    }

    @Override
    public void deleteOrder(int idOrder) {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM order WHERE idOrder=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, idOrder);

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
    }

    @Override
    public void update(Order order) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE ORDER SET idUser=?, idProduct=?, index=?, dateTime=?, deliveryAddress=?, amount=?, status=?, review=? WHERE idOrder=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, order.getIdUser());
            preparedStatement.setInt(2, order.getIdProduct());
            preparedStatement.setInt(3, order.getIndex());
            preparedStatement.setString(4, order.getDateTime());
            preparedStatement.setString(5, order.getDeliveryAddress());
            preparedStatement.setInt(6, order.getAmount());
            preparedStatement.setString(7, order.getStatus());
            preparedStatement.setString(7, order.getReview());

            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
    }
}