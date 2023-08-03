package org.example.service;

import org.example.connection.DbConnection;
import org.example.model.ShoppingModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoppingService {

  public void createOderBurger(ShoppingModel shoppingModel) {
    String sql = "INSERT INTO orders (typeBurger, burgerAmount, burgerValue, totalApayament) " +
        "VALUES ('" + shoppingModel.getTypeBurger() + "', '" + shoppingModel.getBurgerAmount() + "', '"
        + shoppingModel.getBurgerValue() + "', '" + shoppingModel.getTotalApayament() + "')";
    try {
      Statement statement = DbConnection.getConnection().createStatement();
      statement.executeUpdate(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void createDrinkOrder(ShoppingModel shoppingModel) {
    String sql = "INSERT INTO orders (typeDrink, drinkAmount, drinkValue, totalApayament)" +
        "VALUES ('" + shoppingModel.getTypeDrink() + "', '" + shoppingModel.getDrinkAmount()
        + "', '" + shoppingModel.getDrinkValue() + "', '" + shoppingModel.getTotalApayament() + "')";
    try {
      Statement statement = DbConnection.getConnection().createStatement();
      statement.executeUpdate(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void queryOrders() {
    String sql = "SELECT * FROM orders";
    try {
      Statement statement = DbConnection.getConnection().createStatement();
      ResultSet rs = statement.executeQuery(sql);
      while (rs.next()) {
        System.out.println("ID: " + rs.getInt("id") +
            "\tLanche: " + (rs.getString("typeBurger")) +
            "\tQuantidade: " + rs.getInt("burgerAmount") +
            "\tBebida: " + rs.getString("typeDrink") +
            "\tQuantidade: " + rs.getInt("drinkAmount") +
            "\tTotal a pagar: " + rs.getDouble("totalApayament"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void editOrderBurger(Integer id, Integer burgerAmount) {
    String sql = "UPDATE orders SET burgerAmount = " + burgerAmount + " WHERE id = " + id;
    try {
      Statement statement = DbConnection.getConnection().createStatement();
      statement.executeUpdate(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void editOrderDrink(Integer id, Integer drinkAmount) {
    String sql = "UPDATE orders SET drinkAmount = " + drinkAmount + " WHERE id = " + id;
    try {
      Statement statement = DbConnection.getConnection().createStatement();
      statement.executeUpdate(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void removeOrder(Integer id) {
    String sql = "DELETE FROM orders WHERE id = " + id;
    try {
      Statement statement = DbConnection.getConnection().createStatement();
      statement.executeUpdate(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void queryTotalApayament() {
    String sql = "SELECT totalApayament FROM orders";
    try {
      Statement statement = DbConnection.getConnection().createStatement();
      ResultSet rs = statement.executeQuery(sql);
      while (rs.next()) {
        System.out.println("Total a pagar R$: " + rs.getInt("totalApayament"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
