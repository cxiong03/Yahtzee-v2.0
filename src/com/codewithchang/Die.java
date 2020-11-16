package com.codewithchang;

import java.util.Random;

public class Die {
    private int numberOfSide = 6;
    private int dieValue;

    public Die() { this.dieValue = 1; }

    public void roll(Random random) { dieValue = random.nextInt(numberOfSide) + 1; }

    public int getDieValue() { return dieValue; }
}
