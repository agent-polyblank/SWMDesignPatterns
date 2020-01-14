package com.kingsam.designPatterns.creational.abstractFactory;

public class roundedShapeFactory implements abstractFactory {
    @Override
    public abstractShape getShape(String shapeType) {
        if (shapeType == "square") {
            return new roundedSquare();
        } else if (shapeType == "rectangle") {
            return new roundedRectangle();
        } else {
            return null;
        }
    }
}
