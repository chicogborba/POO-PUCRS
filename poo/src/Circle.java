public class Circle {
  private Point center;
  private double raio;

  public Circle() {
    this(0, 0, 1);
  }

  public Circle(double cordX, double cordY, double raio) {
    this.center = new Point(cordX, cordY);
    this.raio = raio;
  }

  public String toString() {
    return String.format("Circle:: (%.2f , %.2f) - %.2f",
        center.getCordX(),
        center.getCordY(),
        raio);
  }

  public double getArea() {
    return Math.PI * Math.pow(raio, 2);
  }

  public void moveCircleTo(double cordX, double cordY) {
    this.center.movePointTo(cordX, cordY);
  }

  public void zoomCircle(double zoomPercentage) {
    this.raio = raio + (raio * (zoomPercentage / 100));
  }

}
