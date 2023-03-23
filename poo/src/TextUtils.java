import java.util.ArrayList;

import Products.Product;

public class TextUtils {

  public static void printBar() {
    System.out.println("---------------------------------------------------");
  }

  public static void printlnDecoratedText(String text) {
    printBar();
    System.out.println(text);
    printBar();
  }

  public static void clearConsole() {
    System.out.print("\033[H\033[2J");
  }

  public static void printMenu(String client, String CPF) {
    System.out.println();
    TextUtils.printlnDecoratedText("CLIENTE: " + client + " | CPF: " + CPF);
    System.out.println("Inserir Produto     Emitir Nota     Remover Produto");
    System.out.println("       1                 2                  3");
    TextUtils.printlnDecoratedText("Digite o número da opção desejada: ");
  }

  public static void printProductsList(ArrayList<Product> products) {
    for (Product product : products) {
      System.out.print(product.getCode());
      System.out.print(" - ");
      System.out.print(product.getName());
      System.out.print(" - R$");
      System.out.println(product.getPrice());
    }
  }

  public static void printWelcome() {
    printlnDecoratedText("BEM VINDO AO SISTEMA DE VENDAS");
  }

}
