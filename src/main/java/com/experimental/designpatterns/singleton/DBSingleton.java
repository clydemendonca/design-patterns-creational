package com.experimental.designpatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

    private static volatile DBSingleton instance = null;
    private static volatile Connection connection = null;

    private DBSingleton() {

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (connection != null) {
            throw new RuntimeException("use getConnection() method to create");
        }

        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }

    }

    public static DBSingleton getInstance() {
        // LAZY LOADING
        if (instance == null) {
            synchronized (DBSingleton.class) {
                if (instance == null) {
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            synchronized (DBSingleton.class) {
                if (connection == null) {
                    try {
                        String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
                        connection = DriverManager.getConnection(dbURL);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }

}
