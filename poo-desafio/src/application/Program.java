package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product tv;
        tv = new Product();
        tv.name = "TV"; tv.price = 900.00; tv.quantity = 10;

        System.out.println("Product data:");
        System.out.println("Name: " + tv.name);
        System.out.println("Price: " + tv.price);
        System.out.println("Quantity in stock: " + tv.quantity);
        System.out.println();
        tv.UpdateStats();
        System.out.println();
        tv.AddProducts();
        tv.RemoveProducts();

        sc.close();
    }
}
