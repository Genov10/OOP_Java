package org.example.lab2;

import org.example.lab2.manufacturedInstruments.Tool;
import org.example.lab2.manufacturedInstruments.parameters.Dimensions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tool measuringTape= new Tool("Measuring tape", new Dimensions(20, 10, 10));
        measuringTape.onTheTool();
        measuringTape.onTheTool();
        String status = measuringTape.toolStatus();
        System.out.println(status);

        Tool someTool = new Tool();

        List<Tool> orederedTools = new ArrayList<>();
        orederedTools.add(measuringTape);
        orederedTools.add(someTool);
        orederedTools.add(new Tool("barometer", new Dimensions(19, 18, 4)));

        Costumer Alex = new Costumer("Alex", "Odesa, Pushlinska street 15B", orederedTools);
        Alex.showInfo();
    }
}
