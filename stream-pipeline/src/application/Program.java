package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        Stream<Integer> st1 = list.stream();
        System.out.println("Stream -> "+ Arrays.toString(st1.toArray()));

        System.out.println();
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum -> " + sum);

        System.out.println();
        int product = list.stream().reduce(1, (x,y) -> x * y);
        System.out.println("Product -> " + product);

        System.out.println();
        List<Integer> newList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        System.out.println(newList);
    }
}
