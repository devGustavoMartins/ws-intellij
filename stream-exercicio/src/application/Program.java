package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Product> list = new ArrayList<>();

            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, Double::sum) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();
            names.forEach(System.out::println);

        }catch (IOException e){
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
