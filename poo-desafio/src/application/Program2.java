package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle cesar;
        cesar = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        cesar.height = sc.nextDouble(); cesar.width = sc.nextDouble();
        cesar.Measures();
        sc.close();
    }
}
