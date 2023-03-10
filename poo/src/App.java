
// Import Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // List of products stored in a class
        ArrayList<Product> products = new ProductList().getProducts();

        // Recives a list of products and a scanner
        Program program = new Program(input, products);

        // Start program getting client data ( name and CPF )
        program.InputClientData();
        // Loop to get user input and execute the desired action
        // Ends when the user prints the invoice
        program.actionMenu();

    }
}
