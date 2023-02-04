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
        cesar.width = sc.nextDouble();
        cesar.height = sc.nextDouble();
        System.out.printf("AREA = %.2f%n", cesar.Area());
        System.out.printf("PERIMETER = %.2f%n", cesar.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", cesar.Diagonal());

        sc.close();
    }
}
