package entities;

import entities.enums.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle(){

    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
        return 3.1415*radius*radius;
    }
}
