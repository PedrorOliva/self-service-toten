package org.example.service;

import java.util.Scanner;

public class MenuService {
  Scanner inputUser = new Scanner(System.in);
  UserService user = new UserService();

  boolean menu = true;

  public void userInteraction() {
    do {
      UserMenu();
      int option = inputUser.nextInt();
      switch (option) {
        case 1:
          user.burgerChoice();
          break;
        case 2:
          user.drinkChoice();
          break;
        case 3:
          user.orders();
          break;
        case 4:
          user.editOrder();
          break;
        case 5:
          user.totalApayament();
          break;
        case 6:
          user.deleteOrder();
          break;
        case 7:
          menu = false;
          System.out.println("Pedido finalizado...");
          break;
        default:
          System.out.println("Opção inválida!!");
      }
    } while (menu);

  }
  public static void UserMenu() {
    System.out.println("--- O que deseja pedir? ---" +
        "\n1 - Lanche " +
        "\n2 - Bebida " +
        "\n3 - Mostrar carrinho" +
        "\n4 - Editar pedido" +
        "\n5 - Total a pagar" +
        "\n6 - Remover pedido" +
        "\n7 - Finalizar pedido");
  }
}
