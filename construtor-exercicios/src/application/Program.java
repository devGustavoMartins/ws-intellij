package application;

import util.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        System.out.print("Enter account number: ");
        acc.setNumber(sc.nextInt());

        System.out.print("Enter account holder: ");
        sc.nextLine();
        acc.setHolder(sc.nextLine());

        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        if(answer == 'y'){
            acc.Deposit();
        }else{
            acc.UpdateStats();
        }

        acc.Deposit();
        acc.Withdraw();

        sc.close();
    }
}
