package com.codewithchang;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome() {
        System.out.println("Welcome to Yahtzee!");
    }

    static public void log(String output) {
        System.out.println();
    }
}
