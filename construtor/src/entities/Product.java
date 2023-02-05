package entities;

import java.util.Scanner;

public class Product {
    Scanner sc = new Scanner(System.in);
    private String name;
    private double price;
    private int quantity;


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


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
