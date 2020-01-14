package com.kingsam.designPatterns.creational.abstractFactory;

public class shapeFactory implements abstractFactory {

    @Override
    public abstractShape getShape(String shapeType) {
        if (shapeType == "rectangle") {
            return new Rectangle();
        } else if (shapeType == "square") {
            return new Square();
        } else {
            return null;
        }
    }
}
