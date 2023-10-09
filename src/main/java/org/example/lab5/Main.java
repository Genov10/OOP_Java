package org.example.lab5;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

        try {
            productList.addProduct(new Product("Product 1", "Manufacturer 1", 100.0, 120.0, 12));
            productList.addProduct(new Product("Product 2", "Manufacturer 1", 200.0, 240.0, 24));
            productList.addProduct(new Product("Product 3", "Manufacturer 1", 300.0, 360.0, 36));
            productList.addProduct(new Product("Product 4", "Manufacturer 2", 400.0, 480.0, 48));
            productList.addProduct(new Product("Product 5", "Manufacturer 2", 500.0, 600.0, 60));
            productList.addProduct(new Product("Product 6", "Manufacturer 3", 600.0, 720.0, 72));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        productList.showProducts();

        System.out.println(productList.findProductWithLongestWarranty());

        System.out.println(productList.findLeastManufacturers());

    }
}
