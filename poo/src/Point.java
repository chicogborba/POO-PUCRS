public class Point {
  private double cordX;
  private double cordY;

  public Point(double cordX, double cordY) {
    this.cordX = cordX;
    this.cordY = cordY;
  }

  public String toString() {
    return String.format("Point:: (%d , %d)", cordX, cordY);
  }

  public void movePointTo(double cordX, double cordY) {
    this.cordX = cordX;
    this.cordY = cordY;
  }

  public double getCordX() {
    return this.cordX;
  }

  public double getCordY() {
    return this.cordY;
  }

}
