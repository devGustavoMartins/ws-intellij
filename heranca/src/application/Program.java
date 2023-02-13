package application;

import com.sun.security.jgss.GSSUtil;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1000, "Gustavo", 1000.00);
        BusinessAccount bacc = new BusinessAccount(1002, "Gustavo", 0.00, 500.00);

        // Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Gustavo", 1000.00, 200.00);
        Account acc3 = new SavingsAccount(1004, "Gustavo", 1000.00, 0.01);

        // Downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
        }else if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
        }

        //Override e super
        acc.withdraw(200.00);
        System.out.println(acc.getBalance());

        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());

        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());
    }
}
