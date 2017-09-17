package com.zallerting;

import java.util.Scanner;

public class ScissorRockPaperGame {
    static int random, guess;
    static String computerRandom, playerGuess;
    public static void main(String[] args) {
        // Generate the random 0, 1 or 2
        random = (Math.random() >= 1.0 / 3) ? ((Math.random() >= 2.0 / 3) ? 2: 1) : 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter the guess
        System.out.print("Enter your guess scissor(0), rock(1), paper(2): ");
        // Obtain the inputted guess
        guess = input.nextInt();

        switch (random){
            case(0):
                computerRandom = "scissor";
                break;
            case(1):
                computerRandom = "rock";
                break;
            case(2):
                computerRandom = "paper";
                break;
        }
        switch (guess) {
            case(0):
                playerGuess = "scissor";
                break;
            case(1):
                playerGuess = "rock";
                break;
            case(2):
                playerGuess = "paper";
                break;
        }
        System.out.print("The computer is " + computerRandom + ". You are " + playerGuess);

        // Check the guess whether or not equals to random
        if(guess == random) {
            System.out.println(". You won.");
        } else {
            System.out.println(". It is a draw.");
        }

    }
}