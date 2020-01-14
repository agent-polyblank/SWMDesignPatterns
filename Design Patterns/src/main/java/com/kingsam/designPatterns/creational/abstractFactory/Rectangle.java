package com.kingsam.designPatterns.creational.abstractFactory;

public class Rectangle implements abstractShape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a rectangle");
    }
}
