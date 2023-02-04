public class Main {
    public static void main(String[] args) {
        String name = "gustavo   ";
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(4));
        System.out.println(name.replace('o', 'u'));
        System.out.println(name.substring(0, 2));
        System.out.println(name.trim());

        String newName = "Gustavo de Oliveira Martins";
        String[] vect = newName.split(" ");
        String newName0 = vect[0];
        String newName1 = vect[1];
        String newName2 = vect[2];
        String newName3 = vect[3];

        System.out.println();
        System.out.println(newName0);
        System.out.println(newName2);
        System.out.println(newName3);
    }
}