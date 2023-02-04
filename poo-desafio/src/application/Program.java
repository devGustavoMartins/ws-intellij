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

        tv.InitialStats();
        tv.UpdateStats();
        tv.AddProducts();
        tv.RemoveProducts();

        sc.close();
    }
}
