import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        int counter = 1;
        System.out.println("Vamos contar até " + quantity);
        System.out.println();
        for (int i = 0; i < quantity; i++){
            System.out.println(counter);
            counter+=1;
        }

        sc.close();
    }
}