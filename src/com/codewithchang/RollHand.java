package com.codewithchang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RollHand {
    private List<Die> dice;

    public RollHand() {
        dice = new ArrayList<Die>();
        for (int count = 0; count < 5; count ++) {
            dice.add(new Die());
        }
    }

    public void roll(Random random) {
        for (Die die : dice) {
            die.roll(random);
        }
    }

    public void roll(Random random, int dieChoice) { dice.get(dieChoice).roll(random); }

    public void roll(Random random, List<Integer> dieChoices) {
        for (int choice : dieChoices) {
            roll(random, choice);
        }
    }

    public List<Die> getDice() { return dice; }
}
