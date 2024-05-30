package org.example.model;

public abstract class ProductForSale {

    private String type;
    private  double price;
    private String description;


    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


    public double getPrice(int quantity) {
        return price * quantity;
    }

    public abstract void showDetails();

}