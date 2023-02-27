package application;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // Rápido sem ordem.
        //Set<String> set = new LinkedHashSet<>(); // Lento e ordenado pelo compareTo.
        //Set<String> set = new TreeSet<>(); // Velocidade mediana e ordem de adição.

        set.add("Tablet");
        set.add("Tv");
        set.add("Titanium");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));
        System.out.println();

        for (String p : set) {
            System.out.println(p);
        }
    }
}