import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Client client1 = new Client("João", "05370963029");

        // Products List
        Product Pizza = new Product(2, "🍕 Pizza", 18.0);
        Product Coca = new Product(3, "🥤 Coca", 3.0);
        Product Pastel = new Product(4, "🥐 Pastel", 8.0);

        Sell sell1 = new Sell(client1);

        sell1.add(Pizza, 2);
        sell1.add(Coca);
        sell1.add(Pastel, 3);

        System.out.println(sell1.toString());

    }
}
