import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double saldo;

        if(minutos <= 100){
            saldo = 50;
        }else{
            saldo = (minutos - 100) * 2 + 50;
        }
        System.out.printf("Valor a pagar: R$ %.2f", saldo);

        sc.close();
    }
}