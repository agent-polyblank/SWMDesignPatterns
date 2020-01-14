package com.kingsam.designPatterns.creational.factory;

public class dogFactory {
    public static dogInterface getDog(String howBig) {
        if (howBig == "Smol") {
            return new poodle();
        } else if (howBig == "In awe at the size of this lad") {
            return new rottweiler();
        } else {
            return null;
        }

    }
}
