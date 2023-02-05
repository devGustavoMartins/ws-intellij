package entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return (width*2) + (height*2);
    }

    public double Diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }

    public void Measures(){
        System.out.printf("AREA = %.2f%n", Area());
        System.out.printf("PERIMETER = %.2f%n", Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", Diagonal());
    }
}
