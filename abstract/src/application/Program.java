package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //Account acc1 = new Account(1001, "Gustavo", 1000.0); Account cannot be instantiated.
        //Account acc2 = new SavingsAccount(1002, "Gustavo", 1000.0, 0.01); Can be instantiated because it's a SavingsAccount.
        //Account acc3 = new BusinessAccount(1003, "Gustavo", 1000.0, 500.0); Can be instantiated because it's a BusinessAccount.

        List<Account> accountList = new ArrayList<>();

        accountList.add(new SavingsAccount(1001, "Gustavo", 500.0, 0.01));
        accountList.add(new BusinessAccount(1002, "Gustavo", 1000.0, 400.0));
        accountList.add(new SavingsAccount(1003, "Gustavo", 300.0, 0.01));
        accountList.add(new BusinessAccount(1004, "Gustavo", 500.0, 500.0));

        double sum = 0.0;
        for(Account acc : accountList){
            System.out.printf("Current balance: R$ %.2f%n", acc.getBalance());
            sum += acc.getBalance();
        }
        System.out.printf("The sum of every account balance is: R$ %.2f%n%n", sum);

        for(Account acc : accountList){
            acc.deposit(100.0);
        }

        double updatedSum = 0.0;
        for(Account acc : accountList){
            System.out.printf("Updated balance: R$ %.2f%n", acc.getBalance());
            updatedSum += acc.getBalance();
        }
        System.out.printf("The sum of every account balance is: R$ %.2f%n%n", updatedSum);
    }
}
