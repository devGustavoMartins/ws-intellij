package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i=0;i<n;i++){
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idSelected = sc.nextInt();

        System.out.print("Percentage: ");
        double percent = sc.nextDouble() / 100;

        for (int i=0;i<n;i++){
            if (employees[i].getId() == idSelected){
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent);
            }
        }

        System.out.println();
        System.out.println("List of employees");

        for (int i=0;i<n;i++){
            System.out.printf("%d, %s, %.2f%n", employees[i].getId(), employees[i].getName(), employees[i].getSalary());
        }

        sc.close();
    }
}
