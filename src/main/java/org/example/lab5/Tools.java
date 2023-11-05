package org.example.lab5;

import org.example.lab5.manufacturedInstruments.Tool;

import java.util.LinkedList;
import java.util.List;

public class Tools {
    private List<Tool> tools;

    public Tools() {
        this.tools = new LinkedList<>();
    }

    public void add(Tool tool) {
        tools.add(tool);
    }
    public void addFirst(Tool tool) {
        tools.add(0, tool);
    }

    public void removeLast() {
        try{
            tools.remove(tools.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("There is any tool already");
        }
    }
    public void removeByIndex(int index) throws RuntimeException{
        try {
            tools.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of list: " + index);
        }
    }

    public boolean isToolExist(String name) {
        for (Tool tool : tools) {
            if (tool.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Tool[] ListToArray() {
        return tools.toArray(new Tool[tools.size()]);
    }

    public void changeEl(Tool newTool, int indexOfEl) {
        tools.get(indexOfEl).setName(newTool.getName());
        tools.get(indexOfEl).setDimensions(newTool.getDimensions());
    }

    public void show() {
        tools.stream().forEach(tool -> System.out.println(tool.getName()));
    }


}
