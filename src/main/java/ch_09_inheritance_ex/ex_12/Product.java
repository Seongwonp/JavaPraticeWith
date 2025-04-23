package ch_09_inheritance_ex.ex_12;

public class Product {
    private String name;
    private int productId;
    private double price;

    public Product(String name, int productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double calculatePrice() {
        return price;
    }
}
