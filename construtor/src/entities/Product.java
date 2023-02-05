package entities;

import java.util.Scanner;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Scanner sc = new Scanner(System.in);

    public void InitialStats(){
        System.out.println("Product data:");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in stock: " + quantity);
    }

    public double TotalValueInStock(){
        return quantity * price;
    }

    public void AddProducts(){
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int addQnt = sc.nextInt();
        quantity += addQnt;
        UpdateStats();
    }

    public void RemoveProducts(){
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int removeQnt = sc.nextInt();
        quantity -= removeQnt;
        UpdateStats();
    }

    public void UpdateStats(){
        System.out.println();
        System.out.printf("Product data: %s, $ %.2f, %d units, Total : $ %.2f", name, price, quantity, TotalValueInStock());
        System.out.println();
    }

    public void Protocol(){
        InitialStats();
        UpdateStats();
        AddProducts();
        RemoveProducts();
    }
}
