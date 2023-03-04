package application;


import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = "C:\\temp\\in.txt";

        try (Scanner sc = new Scanner(System.in); BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Employee> list = new ArrayList<>();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted(Comparator.comparing(String::toString))
                    .toList();
            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);
            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

        } catch (IOException e) {
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
