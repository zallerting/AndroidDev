package com.zallerting;

import java.util.Scanner;

public class ProsAndCons {
    static int random, guess, result;
    public static void main(String[] args) {
        // Generate a  random 0 or 1
        random = (Math.random() > 0.5) ? 1 : 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter a guess
        System.out.print("Enter your guess: ");
        //Obtain the inputted guess
        guess = input.nextInt();

        // Calculate the result
        result = (random == guess) ? 1 : 0;

        switch (result){
            case (1):
                System.out.println("Congratulations, you guess right!");
                break;
            case (0):
                System.out.println("What a blame, you guess wrong!");
                break;
        }

    }
}
