package com.kingsam.designPatterns.creational.abstractFactory;

public class roundedSquare implements abstractShape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a rounded square...");
    }
}
