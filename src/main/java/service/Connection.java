package service;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String URL = "jdbc:mysql://localhost:3306/exam_module3?useSSL=false";
    private static final String USENAME = "root";
    private static final String PASSWORD = "123456";

    public java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
        java.sql.Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(URL, USENAME, PASSWORD);
        return connection;
    }
}
