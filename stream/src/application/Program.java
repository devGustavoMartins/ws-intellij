package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        //Stream a partir de lista
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        Stream<Integer> st1 = list.stream().map(x -> x+1);
        System.out.println(Arrays.toString(st1.toArray()));

        //Stream a partir de Stream.of
        Stream<String> st2 = Stream.of("Gustavo", "Sophia", "Enrico");
        System.out.println(Arrays.toString(st2.toArray()));

        //Stream a partir de uma função
        Stream<Integer> st3 = Stream.iterate(1, x -> x+1);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //Stream de Fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1],p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }
}
