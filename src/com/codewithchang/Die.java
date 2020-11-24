package com.codewithchang;

import java.util.Random;

//v1.0 I have a die
public class Die {
    private int sides;
    private int value;

    public Die() {
        sides = 6;
        value = 1;
    }

<<<<<<< HEAD
    public void roll(Random rand) { value = rand.nextInt(sides) + 1; }
=======
    //v1.1 roll random value
    public void roll(Random rand) { dieValue = rand.nextInt(numberOfSide) + 1; }
>>>>>>> 02-roll-hand

    public int getValue() { return value; }
}
