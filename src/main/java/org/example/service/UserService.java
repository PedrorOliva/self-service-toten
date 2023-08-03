package org.example.service;

import org.example.model.ShoppingModel;

import java.util.Scanner;

public class UserService {
  Scanner inputUser = new Scanner(System.in);
  ShoppingService order = new ShoppingService();
  ShoppingModel item = new ShoppingModel();

  public void burgerChoice() {
    String typeBurger = null;
    Double burgerValue = 0.0;
    Boolean option = true;
    System.out.println("--- Escolha seu lanche ---");
    System.out.println("1 - X-Burger \n2 - X-Salada");
    int choice = inputUser.nextInt();
    if (choice == 1) {
      typeBurger = "X-Burger";
      burgerValue = 10.00;
    } else if (choice == 2) {
      typeBurger = "X-Salada";
      burgerValue = 12.00;
    }
    if (choice < 1 || choice > 2) {
      System.out.println("Opção inválida!!");
    }
    item.setTypeBurger(typeBurger);
    item.setBurgerValue(burgerValue);
    System.out.println("Quantidade: ");
    int burgerAmount = inputUser.nextInt();
    item.setBurgerAmount(burgerAmount);
    Double totalApayament = burgerAmount * burgerValue;
    item.setTotalApayament(totalApayament);
    order.createOderBurger(item);
  }

  public void drinkChoice() {
    String typeDrink = null;
    Double drinkValues = 0.0;
    System.out.println("--- Escolha sua bebida ---");
    System.out.println("1 - Refrigerante \n2 - Suco");
    int choice = inputUser.nextInt();
    if (choice == 1) {
      typeDrink = "Refrigerante";
      drinkValues = 8.00;
    } else if (choice == 2) {
      typeDrink = "Suco";
      drinkValues = 6.00;
    } else {
      System.out.println("Opção inválida!!");
    }
    item.setTypeDrink(typeDrink);
    item.setDrinkValue(drinkValues);
    System.out.println("Quantidade: ");
    int drinkAmount = inputUser.nextInt();
    item.setDrinkAmount(drinkAmount);
    Double totalApayament = drinkAmount * drinkValues;
    item.setTotalApayament(totalApayament);
    order.createDrinkOrder(item);
  }

  public void orders(){
    order.queryOrders();
  }

  public void editOrder(){
    System.out.println("--- Editar bebida ou lanche ---\n1 - Lanche \n2 - Bebida");
    int choice = inputUser.nextInt();
    if(choice == 1){
      System.out.println("Informe o ID do pedido que deseja editar: ");
      int idOrder = inputUser.nextInt();
      System.out.println("Informe a nova quantidade: ");
      int orderAmount = inputUser.nextInt();
      order.editOrderBurger(idOrder, orderAmount);
    }
    if(choice == 2){
      System.out.println("Informe o ID do pedido que deseja editar: ");
      int idOrder = inputUser.nextInt();
      System.out.println("Informe a nova quantidade: ");
      int orderAmount = inputUser.nextInt();
      order.editOrderDrink(idOrder, orderAmount);
    }
  }

  public void deleteOrder(){
    System.out.println("--- Remover um item ---");
    System.out.println("Informe o ID do item que deseja remover: ");
    int idItem = inputUser.nextInt();
    order.removeOrder(idItem);
  }

  public void totalApayament(){
    System.out.println("--- Total a pagar ---");
    order.queryTotalApayament();
  }
}
