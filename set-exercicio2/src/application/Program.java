package application;

import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Student> set = new HashSet<>();
        System.out.print("How many students for course A? ");
        code(sc, set);
        System.out.print("How many students for course B? ");
        code(sc, set);
        System.out.print("How many students for course C? ");
        code(sc, set);
        System.out.println("Total students: " + set.size());
        sc.close();
    }
    public static void code(Scanner sc, Set<Student> set){
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            Integer code = sc.nextInt();
            set.add(new Student(code));
        }
    }
}
