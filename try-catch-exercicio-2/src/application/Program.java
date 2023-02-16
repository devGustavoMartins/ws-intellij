package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account c = new Account(number, name, balance, withdrawLimit);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            c.withdraw(withdraw);
            System.out.print("New balance: ");
        }catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
