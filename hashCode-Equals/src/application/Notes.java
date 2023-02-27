package application;

public class Notes {
    public static void main(String[] args) {
        String a = "Gustavo";
        String b = "Enrico";
        //Equals -> Slow but works perfectly.
        System.out.println(a.equals(b));
        System.out.println(a == b);

        //HashCode -> Fast but sometimes doesn't work well (May have collision).
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
