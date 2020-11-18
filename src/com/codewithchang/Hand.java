package com.codewithchang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Die> dice = new ArrayList<>();

    public Hand(int size) {
        for (int count = 0; count < size; count ++) {
            dice.add(new Die());
        }
    }

    public void roll(Random rand) {
        for (Die die : dice) { // for in loop - for each die in dice
            die.roll(rand);
        }
    }

    public void roll(Random rand, int choice) {
        dice.get(choice).roll(rand);
    }

    public void roll(Random rand, List<Integer> choices) {
        for (int choice : choices) { roll(rand, choice); } // reusing the roll method
    }

    @Override
    public String toString() {
        String output = "";
        for (Die die: dice) {
            output += die.getValue() + " ";
        }
        return output.trim();
    }
}
