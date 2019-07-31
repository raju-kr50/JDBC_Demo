package com.stackroute;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public void displayResultSetMetaData() {
        DatabaseMetaData databaseMetaData;
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCdemo", "root", "");
            PreparedStatement ps=connection1.prepareStatement("select * from demo");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
            connection1.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
