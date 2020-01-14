package com.kingsam.designPatterns.creational.abstractFactory;

public class roundedRectangle implements abstractShape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a rounded rectangle...");
    }
}
