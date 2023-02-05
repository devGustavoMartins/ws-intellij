package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product tv = new Product("TV", 900.00, 10);
        tv.Protocol();
        sc.close();
    }
}
