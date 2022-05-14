package com.company.dao.order;

import com.company.dao.DBWorker;
import com.company.entity.Order;
import org.apache.logging.log4j.LogManager;
//import org.slf4j.Logger;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class DAOOrderImpl extends DBWorker implements DAOOrder{

    private Connection connection = getConnection();

    private static final Logger logger = LogManager.getLogger(DAOOrderImpl.class);

    @Override
    public void addOrder(Order order) {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO shop.`order` (idOrder, idUser, idProduct, shop.`order`.`index`, dateTime, deliveryAddress, amount, status, review) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
            preparedStatement.setString(9, order.getReview());

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
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);

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
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);

        return order;
    }

    @Override
    public void updateOrder(Order order) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE shop.`order` SET idUser=?, idProduct=?, shop.`order`.`index`=?, dateTime=?, deliveryAddress=?, amount=?, status=?, review=? WHERE idOrder=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, order.getIdUser());
            preparedStatement.setInt(2, order.getIdProduct());
            preparedStatement.setInt(3, order.getIndex());
            preparedStatement.setString(4, order.getDateTime());
            preparedStatement.setString(5, order.getDeliveryAddress());
            preparedStatement.setInt(6, order.getAmount());
            preparedStatement.setString(7, order.getStatus());
            preparedStatement.setString(8, order.getReview());
            preparedStatement.setInt(9, order.getIdOrder());

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
    public void deleteOrder(int idOrder) {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM shop.`order` WHERE idOrder=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, idOrder);

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