package com.company.dao.user;

import com.company.dao.DBWorker;
import com.company.dao.order.DAOOrderImpl;
import com.company.entity.User;
import org.apache.logging.log4j.LogManager;
//import org.slf4j.Logger;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DAOUserImpl extends DBWorker implements DAOUser {

    private Connection connection = getConnection();

    private static final Logger logger = LogManager.getLogger(DAOUserImpl.class);

    @Override
    public void addUser(User user) {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO USER (idUser, name, surname, login, status, registrationDateTime, lastOrderDateTime, indexOfProductsPurchased) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getIdUser());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getSurname());
            preparedStatement.setString(4, user.getLogin());
            preparedStatement.setString(5, user.getStatus());
            preparedStatement.setString(6, user.getRegistrationDateTime());
            preparedStatement.setString(7, user.getLastOrderDateTime());
            preparedStatement.setInt(8, user.getIndexOfProductsPurchased());

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
    public List<User> getAllUsers() {

        String query = "select * from user";

        List<User> users = new ArrayList<>();

        try {
            System.out.println("We're connected");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                User user = new User();

                user.setIdUser(resultSet.getInt("idUser"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setLogin(resultSet.getString("login"));
                user.setStatus(resultSet.getString("status"));
                user.setRegistrationDateTime(resultSet.getString("registrationDateTime"));
                user.setLastOrderDateTime(resultSet.getString("lastOrderDateTime"));
                user.setIndexOfProductsPurchased(resultSet.getInt("indexOfProductsPurchased"));

                users.add(user);
            }
            System.out.println(users);
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);

        return users;
    }

    @Override
    public User getByIdUser(int idUser) {
        PreparedStatement preparedStatement = null;
        String sql = "SELECT idUser, name, surname, login, status, registrationDateTime, lastOrderDateTime, indexOfProductsPurchased FROM user WHERE idUser=?";
        User user = new User();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idUser);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            user.setIdUser(resultSet.getInt("idUser"));
            user.setName(resultSet.getString("name"));
            user.setSurname(resultSet.getString("surname"));
            user.setLogin(resultSet.getString("login"));
            user.setStatus(resultSet.getString("status"));
            user.setRegistrationDateTime(resultSet.getString("registrationDateTime"));
            user.setLastOrderDateTime(resultSet.getString("lastOrderDateTime"));
            user.setIndexOfProductsPurchased(resultSet.getInt("indexOfProductsPurchased"));
        }
        catch (SQLException e)
        {
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);

        return user;
    }

    @Override
    public void updateUser(User user) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE USER SET name=?, surname=?, login=?, status=?, registrationDateTime=?, lastOrderDateTime=?, indexOfProductsPurchased=? WHERE idUser=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getLogin());
            preparedStatement.setString(4, user.getStatus());
            preparedStatement.setString(5, user.getRegistrationDateTime());
            preparedStatement.setString(6, user.getLastOrderDateTime());
            preparedStatement.setInt(7, user.getIndexOfProductsPurchased());
            preparedStatement.setInt(8, user.getIdUser());

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
    public void deleteUser(int idUser) {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM user WHERE idUser=?";

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, idUser);

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