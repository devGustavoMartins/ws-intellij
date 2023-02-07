package application;

public class Program {
    public static void main(String[] args) {
        String[] names = new String[] {"Gustavo", "Sophia", "Enrico"};

        /*
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        */
        for(String name : names){
            System.out.println(name);
        }
    }
}
