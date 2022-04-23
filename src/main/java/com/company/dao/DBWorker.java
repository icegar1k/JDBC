package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker
{
    private final String HOST = "jdbc:mysql://localhost:3306/shop?autoReconnect=true&useSSL=false";
    private final String USERNAME = "root";
    private final String PASSWORD = "password";

    private Connection connection;

    public DBWorker()
    {
        try
        {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public String getHOST() {
        return HOST;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
