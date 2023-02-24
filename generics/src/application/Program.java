package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();
        System.out.print("How many values? ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            ps.addValue(sc.nextInt());
        }
        ps.print();
        sc.close();
    }
}
