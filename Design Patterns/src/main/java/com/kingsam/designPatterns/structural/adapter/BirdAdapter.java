package com.kingsam.designPatterns.structural.adapter;

public class BirdAdapter implements toyDuck {

    bird thisBird;

    @Override
    public void squeak() {
        thisBird.makeNoise();
    }

    public BirdAdapter(bird birdArg) {
        this.thisBird = birdArg;
    }

}
