package com.kingsam.designPatterns.structural.adapter;

public class PlasticToyDuck implements toyDuck {
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
