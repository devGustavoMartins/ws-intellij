package application;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<>();

        copy(myInts, myObjects);
        copy(myDoubles, myObjects);

        System.out.println(myObjects);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        destiny.addAll(source);
    }
}
