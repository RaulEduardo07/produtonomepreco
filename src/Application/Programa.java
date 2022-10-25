package Application;

import Entities.Produto;

import javax.lang.model.element.Name;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto ();
        System.out.println("Enter produto data: ");
        System.out.print("Name: ");
        produto.name = sc.nextLine();
        System.out.print("Price: ");
        produto.price = sc.nextDouble();
        System.out.println("Quantity in Stock: ");
        produto.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Produto data: " + produto);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        produto.addProduto(quantity);

        System.out.println();
        System.out.println("Update data: " + produto);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        produto.removeProduto(quantity);

        System.out.println();
        System.out.println("Update data: " + produto);

        sc.close();
    }
}
