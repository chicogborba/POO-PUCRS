public class ProductSold {

  private int quantity;
  private Product product;

  public ProductSold(int quantity, Product product) {
    this.quantity = quantity;
    this.product = product;
  }

  public Double getValue() {
    return this.quantity * this.product.getPrice();
  }

  public Product getProduct() {
    return this.product;
  }

  public int getQuantity() {
    return this.quantity;
  }

}
