package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.printf("Shape #%d data:%n", i+1);

            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.next().charAt(0);

            if (shape == 'r'){
                System.out.print("Color (Black/Blue/Red): ");
                String color = sc.next();

                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapeList.add(new Rectangle(Color.valueOf(color), width, height));
            }else if(shape == 'c'){
                System.out.print("Color (Black/Blue/Red): ");
                String color = sc.next();

                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapeList.add(new Circle(Color.valueOf(color),radius));
            }
        }

        System.out.println();
        System.out.println("Shape areas:");

        for(Shape s : shapeList){
            System.out.printf("%.2f%n", s.area());
        }

        sc.close();
    }
}
