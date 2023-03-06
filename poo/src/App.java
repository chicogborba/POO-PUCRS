import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // create arrayList of Circles
        ArrayList<Circle> circles = new ArrayList<Circle>();
        // create 10 circles
        for (int i = 0; i < 10; i++) {
            circles.add(new Circle());
        }
        // print circles
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        // move circles
        for (Circle circle : circles) {
            circle.moveCircleTo(Math.random() * 100, Math.random() * 100);
        }
        // print circles
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        // zoom circles
        for (Circle circle : circles) {
            circle.zoomCircle(Math.random() * 100);
        }
        // print circles
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }
}
