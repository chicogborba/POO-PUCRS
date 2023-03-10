import java.util.ArrayList;

public class ProductList {

  private ArrayList<Product> products = new ArrayList<Product>();

  public ProductList() {

    Product Pizza = new Product(2, "🍕 Pizza", 18.0);
    Product Coca = new Product(3, "🥤 Coca", 3.0);
    Product Pastel = new Product(4, "🥐 Pastel", 8.0);

    this.products.add(Pizza);
    this.products.add(Coca);
    this.products.add(Pastel);
  }

  public ArrayList<Product> getProducts() {
    return this.products;
  }

}
