package Products;

public class ProductEletronic extends Product {

  private static int warranty_days = 90;

  public ProductEletronic(int code, String name, Double price) {
    super(code, name, price);
  }

  public static void setWarrantyDays(int newWarrantyDays) {
    warranty_days = newWarrantyDays;
  }

  public String getWarrantyDays() {
    return "Garantia de " + warranty_days + " dias";
  }

  @Override
  public String toString() {
    return super.toString() + " " + getWarrantyDays();
  }

}
