import java.util.ArrayList;

import Clients.Client;
import Products.Product;
import Products.ProductSold;

public class Sell {
  private Client client;
  private ArrayList<ProductSold> productsSold;

  public Sell(Client client) {
    this.client = client;
    this.productsSold = new ArrayList<ProductSold>();
  }

  public void add(Product product, int quantity) {
    ProductSold productSold = new ProductSold(quantity, product);
    this.productsSold.add(productSold);
  }

  public void add(Product product) {
    ProductSold productSold = new ProductSold(1, product);
    this.productsSold.add(productSold);
  }

  public void remove(Product product) {
    // Removes item from the list
    for (ProductSold productSold : this.productsSold) {
      if (productSold.getProduct().getCode() == product.getCode()) {
        this.productsSold.remove(productSold);
        break;
      }
    }

  }

  public double getTotalValue() {
    double totalValue = 0.0;
    for (ProductSold productSold : this.productsSold) {
      totalValue += productSold.getValue();
    }
    return totalValue;
  }

  public String toString() {
    String invoice;
    String bar = "-------------------------";
    invoice = bar;
    invoice += "\nClient: " + this.client.getClient();
    invoice += "\nCPF: " + this.client.getDoc();
    invoice += "\n" + bar;
    invoice += "\nProdutos:";
    for (ProductSold productSold : this.productsSold) {
      Product product = productSold.getProduct();
      invoice += "\n - " + productSold.getQuantity() + " " + product.getName();
      invoice += ":  R$ " + product.getPrice() * productSold.getQuantity();
    }
    invoice += "\n" + bar;
    invoice += "\nTotal: R$ " + this.getTotalValue();
    invoice += "\n" + bar;

    return invoice;
  }
}
