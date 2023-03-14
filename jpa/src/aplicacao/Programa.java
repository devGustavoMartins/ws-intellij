package aplicacao;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Gustavo Martins", "gustavo@gmail.com");
        Pessoa p2 = new Pessoa(2, "Carlos Braga", "carlos@gmail.com");
        Pessoa p3 = new Pessoa(3, "Guilherme Silva", "guilherme@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
