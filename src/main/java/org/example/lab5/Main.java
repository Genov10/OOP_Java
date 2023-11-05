package org.example.lab5;

import org.example.lab5.manufacturedInstruments.Tool;
import org.example.lab5.manufacturedInstruments.parameters.Dimensions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tools tools = new Tools();

        tools.add(new Tool("Measuring tape", new Dimensions(20, 10, 10)));
        tools.add(new Tool("line", new Dimensions(1, 2, 20)));
        tools.add(new Tool("Hummer", new Dimensions(20, 8, 4)));
        tools.show();

        System.out.println("2---------------");
        tools.addFirst(new Tool("barometer", new Dimensions(19, 18, 4)));
        tools.show();

        System.out.println("7---------------");
        tools.removeLast();
        tools.show();

        System.out.println("18---------------");
        tools.removeByIndex(3);
        tools.removeByIndex(1);
        tools.show();

        System.out.println("11---------------");
        System.out.println(tools.isToolExist("barometer"));
        System.out.println(tools.isToolExist("level"));

        System.out.println("12---------------");
        System.out.println(tools.ListToArray());

        System.out.println("17---------------");

        tools.changeEl(new Tool("Level", new Dimensions(5, 5, 200)), 0);
        tools.show();
    }
}
