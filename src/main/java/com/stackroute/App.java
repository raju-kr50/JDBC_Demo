package com.stackroute;

import java.sql.DatabaseMetaData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JdbcBasicsDemo demo = new JdbcBasicsDemo();
        demo.displayUser();
        demo.getUserByName("Raju");
        //Database metadata demo calling
        DatabaseMetaDataDemo databaseMetaDataDemo = new DatabaseMetaDataDemo();
        databaseMetaDataDemo.displayMetadata();

        ResultSetMetaDataDemo resultSetMetaDataDemo = new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.displayResultSetMetaData();

        RowSetDemo rowSetDemo = new RowSetDemo();
        rowSetDemo.displayRowSet();

        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        jdbcTransactionDemo.displayTransaction();
    }
}
