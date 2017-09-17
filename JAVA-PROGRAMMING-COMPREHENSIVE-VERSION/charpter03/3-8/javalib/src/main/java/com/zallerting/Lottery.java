package com.zallerting;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Generate a lottery digit
        int lottery = (int)(Math.random() * 100);

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter a guess number
        System.out.print("Enter your lottery pick(two digits):");
        // Obtain the inputed guess number
        int guess = input.nextInt();

        // Calculate single digit from two digits
        int lotteryDigit_1 = lottery / 10;
        int lotteryDigit_2 = lottery % 10;
        int guessDigit_1 = guess / 10;
        int guessDigit_2 = guess % 10;

        // Check whether or not win and bonus quantity
        if(lottery == guess) {
            System.out.println("Each match, and lottery bonus is $10,000.");
        } else if(lotteryDigit_1 == guessDigit_1 &&
                  lotteryDigit_2 == guessDigit_2) {
            System.out.println("Match all digits but sequence everse, and lottery bonus is $3,000.");
        } else if(lotteryDigit_1 == guessDigit_1 ||
                  lotteryDigit_1 == guessDigit_2 ||
                  lotteryDigit_2 == guessDigit_1 ||
                  lotteryDigit_2 == guessDigit_2) {
            System.out.println("Match one digits, and lottery bonus is $1,000.");
        } else {
            System.out.println("Sorry, no match.");
        }

    }
}
