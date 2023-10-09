//1,2,30,35
package org.example.lab5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductList {
    List<Product> products;
    public ProductList() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) throws Exception {
        if (p.getWarrantyPeriod() < 1) {
            throw new Exception("Warranty period must be at least 1 month");
        }
        for (Product product : products) {
            if (product.getName().equals(p.getName()) && product.getManufacturer().equals(p.getManufacturer())) {
                if (product.getWarrantyPeriod() != p.getWarrantyPeriod()) {
                    throw new Exception("Product already exists with different warranty period");
                }
                return;
            }
        }
        products.add(p);
    }

    public void showProducts() {
        System.out.println("Product List:\n");
        for (Product product : products){
            System.out.println("    Name: " + product.getName() +
                    " | Manufacturer: " + product.getManufacturer()
            );
        };
    }

    public String findProductWithLongestWarranty() {
        Product productWithLongestWarranty = null;
        int longestWarrantyPeriod = 0;
        for (Product product : products) {
            if (product.getWarrantyPeriod() > longestWarrantyPeriod) {
                longestWarrantyPeriod = product.getWarrantyPeriod();
                productWithLongestWarranty = product;
            }
        }
        return "\nProduct with Longest Warranty:\n    Name: " + productWithLongestWarranty.getName() +
                " | Manufacturer: " + productWithLongestWarranty.getManufacturer() +
                " | Warranty Period: " + productWithLongestWarranty.getWarrantyPeriod();
    }

    public String findLeastManufacturers() {
        Map<String, Integer> manufacturerCounts = new HashMap<>();

        // Count the number of products produced by each manufacturer
        for (Product product : products) {
            String manufacturer = product.getManufacturer();
            manufacturerCounts.put(manufacturer, manufacturerCounts.getOrDefault(manufacturer, 0) + 1);
        }

        // Find the manufacturer with the fewest products
        String manufacturerWithFewestProducts = null;
        int minProductCount = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : manufacturerCounts.entrySet()) {
            if (entry.getValue() < minProductCount) {
                minProductCount = entry.getValue();
                manufacturerWithFewestProducts = entry.getKey();
            }
        }

        return manufacturerWithFewestProducts;
    }

}
