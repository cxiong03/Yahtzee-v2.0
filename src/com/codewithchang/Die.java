package com.codewithchang;

import java.util.Random;

//v1.0 I have a die
public class Die {
    private int numberOfSide = 6;
    private int dieValue;

    public Die() {
        this.dieValue = 1;
    }

    //v1.1 roll random value
    public void roll(Random rand) { dieValue = rand.nextInt(numberOfSide) + 1; }
    public int getDieValue() { return dieValue; }
}
