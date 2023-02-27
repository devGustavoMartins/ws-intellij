package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Gustavo", "gustavo@gmail.com");
        Client c2 = new Client("Enrico", "enrico@gmail.com");
        Client c3 = new Client("Gustavo", "gustavo@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c3); // Different objects, same data -> false.
    }
}
