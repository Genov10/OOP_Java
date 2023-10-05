package org.example.lab4;

import org.example.lab4.tools.MeasuringTool;

import java.util.List;

public class Costumer {
    private String name;
    private String addres;
    private List<MeasuringTool> orderedTools;

    public Costumer(String name, String addres, List<MeasuringTool> orderedTools) {
        this.name = name;
        this.addres = addres;
        this.orderedTools = orderedTools;
    }

    public void showInfo() {
        System.out.println("\n" + name + ",\n" + addres + ",\nOrdered tools: ");
        for (MeasuringTool tool : orderedTools) {
            System.out.println("    " + tool.getName() + " | " +
                    tool.getDimensions().getWidth() + "x" +
                    tool.getDimensions().getHeight() +  "x" +
                    tool.getDimensions().getLength() + "sm");
        }

    }
}
