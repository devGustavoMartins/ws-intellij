package application;
import java.util.Arrays;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
        List<String> myNames = Arrays.asList("Gustavo", "Sophia", "Enrico");
        printList(myNames);
    }
    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
