package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Gustavo");
        list.add("Sophia");
        list.add(1, "Martins");
        list.add(3, "Franchi");
        list.remove(1);
        list.remove(2);

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-------------");

        list.add(0, "Maria");
        list.add(2, "Ana Maria Braga");
        list.add("Maria Eduarda");
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-------------");


        list.removeIf(x -> x.charAt(0) == 'M');
        list.removeIf(x -> x.charAt(0) == 'A');
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-------------");
        System.out.println("Index of Gustavo -> " + list.indexOf("Gustavo"));
        System.out.println("-------------");
    }
}
