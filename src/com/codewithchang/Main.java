package com.codewithchang;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
<<<<<<< HEAD
        Hand myHand = new Hand(5);

        Console.welcome();
        myHand.roll(rand);
        System.out.println(myHand);
        myHand.roll(rand, Console.getChoices());
        System.out.println(myHand);
        myHand.roll(rand, Console.getChoices());
        System.out.println(myHand);
=======
        Console.welcome();
>>>>>>> 02-roll-hand
    }
}
