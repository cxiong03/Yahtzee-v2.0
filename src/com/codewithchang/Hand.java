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

    @Override
    public String toString() {
        String output = "";
        for (Die die: dice) {
            output += die.getValue() + " ";
        }
        return output.trim();
    }

//    public void roll(Random rand, int dieChoice) { dice.get(dieChoice).roll(rand); }
//
//    public void roll(Random random, List<Integer> dieChoices) {
//        for (int choice : dieChoices) {
//            roll(random, choice);
//        }
//    }
//
//    public List<Die> getDice() { return dice; }
}
