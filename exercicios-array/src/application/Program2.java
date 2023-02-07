package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] rents = new Rent[10];

        for (int i=0;i<n;i++){
            System.out.println();
            System.out.println("Rent # " + (i + 1));

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            rents[room] = new Rent(name, email, room);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0;i<10;i++){
            if (rents[i] != null){
                System.out.printf("%d: %s, %s%n", rents[i].getRoomNumber(), rents[i].getName(), rents[i].getEmail());
            }
        }

        sc.close();
    }
}
