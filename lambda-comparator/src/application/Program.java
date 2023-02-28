package application;

import entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Notebook", 8000.00));
        list.add(new Product("TV", 1000.00));
        list.add(new Product("Computer", 4500.00));

        Comparator<Product> comp = Comparator.comparing(p -> p.getName().toUpperCase());

        list.sort(comp);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
