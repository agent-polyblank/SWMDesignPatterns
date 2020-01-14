package com.kingsam.designPatterns.creational.abstractFactory;

public class FactoryProducer {
    public static abstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new roundedShapeFactory();
        } else {
            return new shapeFactory();
        }
    }
}
