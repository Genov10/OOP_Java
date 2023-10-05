package org.example.lab3.tools;

import org.example.lab3.tools.parameters.Dimensions;

import java.util.Scanner;

public class MeasuringTool extends Tool{
    Scanner scanner = new Scanner(System.in);
    private String name;
    private Dimensions dimensions;
    private boolean isUsing = false;

    public MeasuringTool(String name, Dimensions dimensions) {
        this.name = name;
        this.dimensions = dimensions;
    }

    public MeasuringTool() {
        System.out.println("Enter a name ");
        this.name = scanner.next();
        System.out.println("Enter width, length, height ");
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();
        this.dimensions = new Dimensions(height, width, length);
    }

    public String toolStatus() {
        if (dimensions.getHeight() != 0 && dimensions.getLength() != 0 && dimensions.getWidth() != 0) {
            return name + " is espaliered";
        }
        return name + " is not espaliered";
    }

    public void use() {
        if (!isUsing) {
            isUsing = true;
            System.out.println(name +" ready to be use");
        } else {
            System.out.println(name + " is already using");
        }
    }
    public String getName() {
        return name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }


}
