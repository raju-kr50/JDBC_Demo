package com.stackroute;

import java.sql.*;

public class JdbcTransactionDemo {
    public void displayTransaction() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCdemo", "root", "");
            connection1.setAutoCommit(true);
            Statement stmt=connection1.createStatement();

            stmt.executeUpdate("insert into demo values('abhigcvhjbk',24,'M')");
            stmt.executeUpdate("insert into demo values('umesh',25,'Male')");
            connection1.commit();
            ResultSet resultSet= stmt.executeQuery("select * from demo");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
            connection1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
