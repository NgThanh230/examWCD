package com.example.exam.database;

import java.sql.*;

public class Database {
    public static Connection getConnection() throws SQLException {
        try {
            // Tải driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Kết nối tới cơ sở dữ liệu
            String url = "jdbc:mysql://localhost:3307/player_evaluation";
            String user = "root";
            String password = "";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error connecting to database", e);
        }
    }
}
