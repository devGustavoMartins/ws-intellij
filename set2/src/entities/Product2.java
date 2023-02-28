package entities;


public class Product2 implements Comparable<Product2>{
    private String name;
    private Double price;

    public Product2(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product2 o) {
        return price.compareTo(o.getPrice());
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}