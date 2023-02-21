package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("2806");
        p.processDoc("My Girlfriend");
        p.print("My Girlfriend");

        System.out.println();

        ConcreteScanner s = new ConcreteScanner("2301");
        s.processDoc("My Friend");
        System.out.println("Scan result: " + s.scan());

        System.out.println();

        ComboDevice c = new ComboDevice("1206");
        c.processDoc("My birthday");
        c.print("My birthday");
        System.out.println("Scan result: " + c.scan());
    }
}
