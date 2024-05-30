package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = {
            new Coke("Coke", 1.5, "Coca Cola", 500),
            new Bread("Bread", 2.5, "Whole Wheat", 500),
            new Chocolate("Chocolate", 3.5, "Dark Chocolate", "Bitter")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}