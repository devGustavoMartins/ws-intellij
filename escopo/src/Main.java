public class Main {
    public static void main(String[] args) {
        double price = 400;
        double discount;
        if (price < 200) {
            discount = price * 0.5;
        }else{
            discount = 0;
        }

        System.out.println(price);
        System.out.println(discount); //Não irá funcionar caso o valor de price seja maior que 200 e não tenha o else.
    }
}