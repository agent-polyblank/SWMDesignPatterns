package com.kingsam.designPatterns.structural.adapter;

public class sparrow implements bird{

    @Override
    public void fly() {
        System.out.println("*flapping*");
    }

    @Override
    public void makeNoise(){
        System.out.println("chirp");
    }
}
