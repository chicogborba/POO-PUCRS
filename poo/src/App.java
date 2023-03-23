
// Import Scanner
import java.util.ArrayList;
import java.util.Scanner;

import Clients.Client;
import Clients.ClientPF;
import Clients.ClientPJ;
import Clients.Student;
import Products.Product;
import Products.ProductEletronic;
import Products.ProductList;

public class App {
    public static void main(String[] args) throws Exception {

        // OLD CODE

        // Scanner input = new Scanner(System.in);

        // // List of products stored in a class
        // ArrayList<Product> products = new ProductList().getProducts();

        // // Recives a list of products and a scanner
        // Program program = new Program(input, products);

        // // Start program getting client data ( name and CPF )
        // program.InputClientData();
        // // Loop to get user input and execute the desired action
        // // Ends when the user prints the invoice
        // program.actionMenu();
        // input.close();

        TextUtils.clearConsole();

        TextUtils.printBar();
        System.out.println("TESTE GARANTIA");
        TextUtils.printBar();

        ProductEletronic produtoEletronico = new ProductEletronic(1212, "Tablet", 1500.0);
        System.out.println(produtoEletronico.toString());
        TextUtils.printBar();
        System.out.println("MUDANDO GARANTIA");
        TextUtils.printBar();
        ProductEletronic.setWarrantyDays(12);
        System.out.println(produtoEletronico.getWarrantyDays());
        System.out.println(produtoEletronico.toString());

        TextUtils.printBar();
        System.out.println("TESTE CLIENTE");

        Client clienteNormal = new Client("JoãoNormal", "111111111");
        TextUtils.printBar();
        System.out.println(clienteNormal.toString());

        ClientPF clientePF = new ClientPF("MariaCPF", "2222222");
        TextUtils.printBar();
        System.out.println(clientePF.toString());

        ClientPJ clientePJ = new ClientPJ("EmpresaCNPJ", "33333");
        TextUtils.printBar();
        System.out.println(clientePJ.toString());

        Student clienteEstudante = new Student("JoãoEstudante", "44444444", "PUCRS");
        TextUtils.printBar();
        System.out.println(clienteEstudante.toString());
        TextUtils.printBar();

    }
}
