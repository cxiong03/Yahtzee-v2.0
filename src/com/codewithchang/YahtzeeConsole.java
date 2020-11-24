package com.codewithchang;

import java.util.ArrayList;
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

    // Choose specific die to re-roll
    static public int getChoice() {
        System.out.print("Which die do you want to re-roll 1-5: ");
        String input = scanner.nextLine();
        return Integer.parseInt(input) -1; // converting string into int and -1 to correct indexing
    }

    // Choose multiple dice to re-roll
    static public List<Integer> getChoices() {
        System.out.print("Which dice do you want to re-roll? ex 1 2 3: ");
        String input = scanner.nextLine(); // "1 2 3"
        String[] inputArray = input.split(" "); // ["1", "2", "3"]
        List<Integer> choices = new ArrayList<Integer>();
        for (String choice : inputArray) {
            choices.add(Integer.parseInt(choice) - 1);
        }
        return choices;
    }
}
