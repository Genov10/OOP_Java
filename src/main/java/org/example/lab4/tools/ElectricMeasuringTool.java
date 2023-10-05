package org.example.lab4.tools;

import org.example.lab4.tools.parameters.Dimensions;

public class ElectricMeasuringTool extends MeasuringTool implements ElectricTool{
    private double voltage;
    private double current;
    private double frequency;
    private boolean isOn = false;
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

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(super.getName() +" turned on");
        } else {
            System.out.println(super.getName() + " already turned on");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(super.getName() +" turned off");
        } else {
            System.out.println(super.getName() + " already turned off");
        }
    }

    public void use() {
        if (!super.isUsing) {
            turnOn();
            isUsing = true;
            System.out.println(super.getName() +" ready to be use");
        } else {
            System.out.println(super.getName() + " is already using");
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
