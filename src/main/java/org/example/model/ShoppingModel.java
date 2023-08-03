package org.example.model;

public class ShoppingModel {
  private Integer id;
  private String typeBurger;
  private Integer burgerAmount;
  private Double burgerValue;
  private String typeDrink;
  private Integer drinkAmount;
  private Double drinkValue;
  private Double totalApayament;

  public ShoppingModel(){}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTypeBurger() {
    return typeBurger;
  }

  public void setTypeBurger(String typeBurger) {
    this.typeBurger = typeBurger;
  }

  public Integer getBurgerAmount() {
    return burgerAmount;
  }

  public void setBurgerAmount(Integer burgerAmount) {
    this.burgerAmount = burgerAmount;
  }

  public Double getBurgerValue() {
    return burgerValue;
  }

  public void setBurgerValue(Double burgerValue) {
    this.burgerValue = burgerValue;
  }

  public String getTypeDrink() {
    return typeDrink;
  }

  public void setTypeDrink(String typeDrink) {
    this.typeDrink = typeDrink;
  }

  public Integer getDrinkAmount() {
    return drinkAmount;
  }

  public void setDrinkAmount(Integer drinkAmount) {
    this.drinkAmount = drinkAmount;
  }

  public Double getDrinkValue() {
    return drinkValue;
  }

  public void setDrinkValue(Double drinkValue) {
    this.drinkValue = drinkValue;
  }

  public Double getTotalApayament() {
    return totalApayament;
  }

  public void setTotalApayament(Double totalApayament) {
    this.totalApayament = totalApayament;
  }
}
