package org.example.lab4.tools;

public interface ElectricTool extends Tool{
    double SAFELY_VOLTAGE = 230;
    double SAFELY_CURRENT = 50;
    double SAFELY_FREQUENCY = 15;
    void turnOn();
    void turnOff();

}
