package entities;

public class Triangle {
    public double a, b, c;

    public double area(){
        double tP = (a + b + c) / 2.0;
        return Math.sqrt(tP * (tP - a) * (tP - b) * (tP - c));
    }
}
