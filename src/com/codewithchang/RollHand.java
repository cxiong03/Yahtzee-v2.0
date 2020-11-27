package com.codewithchang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RollHand {
    //instantiate a list
    private List<Die> dice;

    //creates 5 dice and adds it
    public RollHand() {
        dice = new ArrayList<Die>();
        for (int count = 0; count < 5; count ++) {
            dice.add(new Die());
        }
    }

    //roll all dice with random values
    public void roll(Random rand) {
        for (Die die : dice) {
            die.roll(rand);
        }
    }

    //re-roll a specific die
    public void roll(Random rand, int dieChoice) { dice.get(dieChoice).roll(rand); }

    //Overload
    public void roll(Random rand, List<Integer> dieChoices) {
        for (int choice : dieChoices) {
            roll(rand, choice);
        }
    }

    //getter for YahtzeeConsole
    public List<Integer> getDice() {
        List<Integer> values = new ArrayList<>();
        for (var die : dice) {
            values.add(die.getDieValue());
        }
        return values;
    }
}
