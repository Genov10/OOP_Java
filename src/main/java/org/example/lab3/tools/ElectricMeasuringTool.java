package org.example.lab3.tools;

import org.example.lab3.tools.parameters.Dimensions;

public class ElectricMeasuringTool extends MeasuringTool{
    private final double SAFELY_VOLTAGE = 230;
    private final double SAFELY_CURRENT = 50;
    private final double SAFELY_FREQUENCY = 15;
    private double voltage;
    private double current;
    private double frequency;
    public ElectricMeasuringTool(String name, Dimensions dimensions, double voltage, double current, double frequency) {
        super(name, dimensions);
        this.voltage = voltage;
        this.current = current;
        this.frequency = frequency;
    }

    private boolean isToolSafety() {
        if (voltage < SAFELY_VOLTAGE && current < SAFELY_CURRENT && frequency < SAFELY_FREQUENCY) {
            System.out.println("You can use your tool, it safety");
            return true;
        } else {
            System.out.println("Don`t use, it can be dangerous!");
            return false;
        }
    }

    public String toolStatus() {
        if (super.getDimensions().getHeight() != 0 && super.getDimensions().getLength() != 0 && super.getDimensions().getWidth() != 0 && isToolSafety()) {
            System.out.println(isToolSafety() + "\n" + super.getName() + " is espaliered");
            return super.getName() + " is espaliered";
        }else {
            System.out.println(isToolSafety() + "\n" + super.getName() + " is not espaliered");
            return super.getName() + " is not espaliered";
        }
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getSAFELY_VOLTAGE() {
        return SAFELY_VOLTAGE;
    }

    public double getSAFELY_CURRENT() {
        return SAFELY_CURRENT;
    }

    public double getSAFELY_FREQUENCY() {
        return SAFELY_FREQUENCY;
    }
}
