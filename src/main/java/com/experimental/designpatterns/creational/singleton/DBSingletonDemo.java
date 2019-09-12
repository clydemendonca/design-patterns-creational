package com.experimental.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSingletonDemo {

    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        Connection connection = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement statement;
        try {
            statement = connection.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Address(ID INT, StreetName VARCHAR(20), "
                    + "City VARCHAR(20))");
            System.out.println("Table created.");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        connection = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

    }

}
