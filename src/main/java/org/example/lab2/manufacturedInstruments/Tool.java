package org.example.lab2.manufacturedInstruments;

import org.example.lab2.manufacturedInstruments.parameters.Dimensions;

import java.util.Scanner;

public class Tool {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private Dimensions dimensions;
    private boolean toolOn = false;

    public Tool(String name, Dimensions dimensions) {
        this.name = name;
        this.dimensions = dimensions;
    }

    public Tool() {
        System.out.println("Enter a name ");
        this.name = scanner.next();
        System.out.println("Enter width, length, height ");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        int height = scanner.nextInt();
        this.dimensions = new Dimensions(height, width, length);
    }

    public String toolStatus() {
        if (dimensions.getHeight() != 0 && dimensions.getLength() != 0 && dimensions.getWidth() != 0) {
            return name + " is espaliered";
        }
        return name + " is not espaliered";
    }

    public void onTheTool() {
        if (!toolOn) {
            toolOn = true;
            System.out.println(name +" has turned on");
        } else {
            System.out.println(name + " is already turned on");
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
