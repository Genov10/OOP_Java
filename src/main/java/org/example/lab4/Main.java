package org.example.lab4;

import org.example.lab4.tools.ElectricMeasuringTool;
import org.example.lab4.tools.MeasuringTool;
import org.example.lab4.tools.parameters.Dimensions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MeasuringTool measuringTape = new MeasuringTool("Measuring tape", new Dimensions(5.0, 3.0, 600.0));
        measuringTape.use();
        measuringTape.use();
        String status = measuringTape.toolStatus();
        System.out.println(status);

        MeasuringTool someTool = new MeasuringTool();

        ElectricMeasuringTool electricLevel = new ElectricMeasuringTool("Electric level", new Dimensions(5.0, 3.0, 10.0), 200.0, 40.0, 10.0);
        electricLevel.toolStatus();
        electricLevel.turnOn();
        electricLevel.turnOff();
        electricLevel.use();
        electricLevel.turnOn();

        List<MeasuringTool> orederedTools = new ArrayList<>();
        orederedTools.add(measuringTape);
        orederedTools.add(someTool);
        orederedTools.add(new MeasuringTool("barometer", new Dimensions(19, 18, 4)));
        orederedTools.add(electricLevel);

        Costumer Alex = new Costumer("Alex", "Odesa, Pushlinska street 15B", orederedTools);
        Alex.showInfo();
    }
}
