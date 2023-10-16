package org.example.control.firstEx;
/**
 * Клас, що представляє продукт.
 */
public class Product {
    private String name;
    private double price;
    /**
     * Конструктор класу Product.
     *
     * @param name  Назва продукту.
     * @param price Ціна продукту.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    /**
     * Гетери та сетери .
     */
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
}
