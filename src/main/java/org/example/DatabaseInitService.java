package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseInitService {
    private static final DatabaseInitService instance = new DatabaseInitService();

    private Connection connection;

    private DatabaseInitService() {
        try {
            String connectionUrl = "jdbc:h2:./test1";
            connection = DriverManager.getConnection(connectionUrl);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static DatabaseInitService getInstanse() {
        return instance;
    }


    public Connection getConnection() {
        try {
            if (connection.isClosed()) {
                String connectionUrl = "jdbc:h2:./test1";
                connection = DriverManager.getConnection(connectionUrl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
