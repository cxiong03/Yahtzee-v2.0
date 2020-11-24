package com.codewithchang;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> 02-roll-hand
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome() {
<<<<<<< HEAD
        System.out.println("Welcome to Yahtzee");
    }

    static public int getChoice() {
        System.out.print("Choose die 1-5 to re-roll: ");
        int choice = scanner.nextInt();
        return choice -1;
    }

     static public List<Integer> getChoices() {
        List<Integer> choices = new ArrayList<>();
        // TODO: get the choices
         System.out.println("Which dice do you want to re-roll?");
         String input = scanner.nextLine(); // "2 4 5"
         String[] inputArray = input.split(" "); // ["2", "4", "5"] -> <2, 4, 5>
         for (String number : inputArray) {
             choices.add(Integer.parseInt(number) -1);
         }

        return choices;
     }
=======
        System.out.println("Welcome to Yahtzee!");
    }

    static public void log(String output) {
        System.out.println();
    }
>>>>>>> 02-roll-hand
}
