package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection conn = null;
    private final static String url = "jdbc:mysql://localhost:3306/sqq";
    private final static String userName = "root";
    private final static String password = "1337228";
   public static Connection getConnection(){
       try {
           Connection conn = DriverManager.getConnection(url,userName,password);
           return conn;
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }

   }
}
