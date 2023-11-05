package org.example.lab5;

import org.example.lab5.manufacturedInstruments.Tool;

import java.util.List;

public class Costumer {
    private String name;
    private String addres;
    private List<Tool> orderedTools;

    public Costumer(String name, String addres, List<Tool> orderedTools) {
        this.name = name;
        this.addres = addres;
        this.orderedTools = orderedTools;
    }

    public void showInfo() {
        System.out.println("\n" + name + ",\n" + addres + ",\nOrdered tools: ");
        for (Tool tool : orderedTools) {
            System.out.println("    " + tool.getName() + " | " +
                    tool.getDimensions().getWidth() + "x" +
                    tool.getDimensions().getHeight() +  "x" +
                    tool.getDimensions().getLength());
        }

    }
}
