package org.example.lab5;

public class Product {
    private String name;
    private String manufacturer;
    private double fullPrice;
    private double retailPrice;
    private int warrantyPeriod;

    public Product(String name, String manufacturer, double fullPrice, double retailPrice, int warrantyPeriod) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.fullPrice = fullPrice;
        this.retailPrice = retailPrice;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
