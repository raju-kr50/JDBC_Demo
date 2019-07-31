package com.stackroute;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo {
    public void displayRowSet() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/JDBCdemo");
            rowSet.setUsername("root");
            rowSet.setPassword("");
            rowSet.setCommand("select * from demo");
            rowSet.execute();

            while (rowSet.next()) {
                System.out.println("Name: " + rowSet.getString(1));
                System.out.println("Age: " + rowSet.getInt(2));
                System.out.println("Gender: " + rowSet.getString(3));
            }
    } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
