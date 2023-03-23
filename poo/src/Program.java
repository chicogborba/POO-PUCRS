import java.util.ArrayList;
import java.util.Scanner;

import Clients.Client;
import Products.Product;

public class Program {

  private Scanner input;
  private Client client;
  private boolean isInvoicePrinted;
  private Sell sell;
  private ArrayList<Product> products;

  public Program(Scanner input, ArrayList<Product> products) {
    this.input = input;
    this.isInvoicePrinted = false;
    this.products = products;
  }

  public Client getClient() {
    return client;
  }

  public Sell getSell() {
    return sell;
  }

  public void InputClientData() {
    TextUtils.clearConsole();
    TextUtils.printWelcome();
    System.out.println("Para começar, digite o nome do cliente: ");
    TextUtils.printBar();
    String name = input.nextLine();
    TextUtils.printlnDecoratedText("Agora digite o CPF do cliente: ");
    String cpf = input.nextLine();
    client = new Client(name, cpf);
    sell = new Sell(client);
  }

  private void insertProduct() {
    boolean isCodeFound = false;
    boolean isFirstLoop = true;

    while (isCodeFound == false) {
      TextUtils.clearConsole();
      if (isFirstLoop == false) {
        System.out.println("*** CÓDIGO NAO ENCONTRADO ***");
      }
      TextUtils.printlnDecoratedText("Digite o código do produto: ");
      TextUtils.printProductsList(products);
      TextUtils.printBar();

      int code = input.nextInt();

      for (Product product : products) {
        if (product.getCode() == code) {
          TextUtils.clearConsole();
          TextUtils.printlnDecoratedText("Digite a quantidade do produto (" + product.getName() + "): ");
          int quantity = input.nextInt();
          sell.add(product, quantity);

          isCodeFound = true;
        }

      }
      isFirstLoop = false;
    }
  }

  private void emitInvoice() {
    TextUtils.clearConsole();
    System.out.println(sell.toString());
    isInvoicePrinted = true;
  }

  private void removeProduct() {
    boolean isCodeFound = false;
    boolean isFirstLoop = true;

    while (isCodeFound == false) {
      TextUtils.clearConsole();
      if (isFirstLoop == false) {
        System.out.println("*** CÓDIGO NAO ENCONTRADO ***");
      }
      TextUtils.printlnDecoratedText("Digite o código do produto: ");
      TextUtils.printProductsList(products);
      TextUtils.printBar();

      int code = input.nextInt();
      for (Product product : products) {
        if (product.getCode() == code) {
          sell.remove(product);
          isCodeFound = true;
        }
      }
      isFirstLoop = false;
    }
  }

  public void actionMenu() {
    while (isInvoicePrinted == false) {
      TextUtils.clearConsole();
      TextUtils.printMenu(client.getClient(), client.getDoc());
      int option = input.nextInt();
      switch (option) {
        case 1:
          insertProduct();
          break;
        case 2:
          emitInvoice();
          break;
        case 3:
          removeProduct();
          break;
        default:
          break;
      }
    }
  }

}
