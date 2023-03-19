package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println();
            System.out.printf("Employee #%d data:%n", (i+1));

            System.out.print("Outsourced (y/n)? ");
            char answer = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double vph = sc.nextDouble();

            if (answer == 'y'){
                System.out.print("Additional charge: ");
                double addC = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, vph, addC));
            }else{
                employees.add(new Employee(name, hours, vph));
            }
        }

        System.out.println();
        System.out.println("Payments");
        for (Employee e : employees){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }
}
