package com.codewithchang;

import java.util.List;

public class YahtzeeConsole extends Console{
    //Overloading parent method
    static public void welcome() {
        welcome("Yahtzee!");
    }

    //display hand from Die class
    static  public void displayHand(List<Die> dice) {
        System.out.println("---------");
        for(Die die : dice) {
            System.out.print(die.getDieValue() + " ");
        }
        System.out.print("\n---------\n");
    }

    static public int getChoice() {
        System.out.print("Which die do you want to re-roll 1-5: ");
        String input = scanner.nextLine();
        return Integer.parseInt(input) -1; // converting string into int and -1 to correct indexing
    }
}
