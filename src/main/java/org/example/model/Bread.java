package org.example.model;

public class Bread extends ProductForSale{

    private int size;

    public Bread(String type, double price, String description, int size) {
        super(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Size: " + size);
    }
}
