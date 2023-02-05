package util;

public class CurrencyConverter {
    public static double AmountToPay(double price, double quantity){
        return quantity * price * 1.06;
    }
}
