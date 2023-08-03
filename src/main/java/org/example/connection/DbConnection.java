package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
  public static Connection getConnection(){
    try {
      return DriverManager.getConnection("jdbc:postgresql://localhost:5432/autoatendimento",
          "postgres", "07092417");
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }
}
