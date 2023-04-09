package util;


import java.util.Scanner;

public class Account {
    public int number;
    public String holder;
    public double balance;
    Scanner sc = new Scanner(System.in);

    public Account(){

    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

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
