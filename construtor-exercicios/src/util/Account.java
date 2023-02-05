package util;


import java.util.Scanner;

public class Account {
    public int number;
    public String holder;
    public double balance;
    Scanner sc = new Scanner(System.in);

    public void Deposit(){
        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        balance += amount;
        UpdateStats();
    }

    public void Withdraw(){
        System.out.print("Enter a withdraw value: ");
        double amount = sc.nextDouble();
        balance -= amount + 5;
        UpdateStats();
    }

    public void UpdateStats(){
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: %.2f%n%n", number, holder, balance);
    }
}
