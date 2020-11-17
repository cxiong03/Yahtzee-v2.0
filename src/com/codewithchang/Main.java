package com.codewithchang;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Hand myHand = new Hand(5);
        myHand.roll(rand);
        System.out.println(myHand.toString());
        myHand.roll(rand);
        System.out.println(myHand.toString());
        myHand.roll(rand);
        System.out.println(myHand.toString());
    }
}
