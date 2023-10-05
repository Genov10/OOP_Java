package org.example.lab4.tools.parameters;

public class Dimensions {
    private double height;
    private double width;
    private double length;

    public Dimensions(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
