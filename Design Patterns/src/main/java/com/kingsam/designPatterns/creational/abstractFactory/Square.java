package com.kingsam.designPatterns.creational.abstractFactory;

public class Square implements abstractShape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a square...");
    }
}
