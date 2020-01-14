package com.kingsam.designPatterns.creational.factory;

public class rottweiler implements dogInterface {
    @Override
    public void bark() {
        System.out.println("*THUNDEROUS BORKING*");
    }
}
