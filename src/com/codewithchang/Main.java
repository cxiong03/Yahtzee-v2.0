package com.codewithchang;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        YahtzeeConsole.welcome();
        RollHand myHand = new RollHand();
        myHand.roll(rand);
        YahtzeeConsole.displayHand(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.getChoices());
        YahtzeeConsole.displayHand(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.getChoices());
        YahtzeeConsole.displayHand(myHand.getDice());
    }
}
