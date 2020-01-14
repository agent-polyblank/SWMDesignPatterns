package com.kingsam.designPatterns.creational.singleton;

public class Singleton {

    private int value;

    private Singleton(int init) {
        value = init;
    }

    public void getValue() {
        System.out.println("Hello from the Singleton value = " + value);
    }

    public void setValue(int newValue) {
        value = newValue;
    }


    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton(1);
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
