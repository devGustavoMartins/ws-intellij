package entities;

public class Circle implements Shape{
    private double PI = 3.1415;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }
}
