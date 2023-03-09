import java.util.ArrayList;

public class Sell {
  private Client client;
  private ArrayList<ProductSold> productsSold;

  public Sell(Client client) {
    this.client = client;
  }

  public void add(Product product, int quantity) {
    ProductSold productSold = new ProductSold(quantity, product);
    this.productsSold.add(productSold);
    System.out.println(productsSold.toString());
  }

  public void add(Product product) {
    ProductSold productSold = new ProductSold(1, product);
    this.productsSold.add(productSold);
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
    invoice += "\nCPF: " + this.client.getCPF();
    invoice += "\n" + bar;
    invoice += "\nProdutos:";
    for (ProductSold productSold : this.productsSold) {
      Product product = productSold.getProduct();
      invoice += "\n - " + productSold.getQuantity() + " " + product.getName();
      invoice += ":  R$ " + product.getPrice();
    }
    invoice += "\n" + bar;
    invoice += "\nTotal: R$ " + this.getTotalValue();
    invoice += "\n" + bar;

    return invoice;
  }
}
