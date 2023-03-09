public class Product {
  private int code;
  private String name;
  private Double price;

  public Product(int code, String name, Double price) {
    this.code = code;
    this.name = name;
    this.price = price;
  }

  public int getCode() {
    return this.code;
  }

  public String getName() {
    return this.name;
  }

  public Double getPrice() {
    return this.price;
  }
}
