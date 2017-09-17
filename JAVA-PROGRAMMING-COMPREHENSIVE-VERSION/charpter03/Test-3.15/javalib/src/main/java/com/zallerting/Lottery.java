package com.zallerting;

import java.util.Scanner;

public class Lottery {
    static int lottery, guess, bonus, rightTimes;
    public static void main(String[] args) {
        // Generate a three-digit lottery number
        lottery = (int) (Math.random() * 900) + 100;
        System.out.println("Lottery is " + lottery);

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter a guess;
        System.out.print("Enter a guess for lottery: ");
        // Obtain the inputted guess
        guess = input.nextInt();

        if (lottery == guess) {
            System.out.println("Congratulations. You guess all right and bonus for you $10000.");
        } else {
            // first digit has match
            if(lottery / 100 == guess / 100 || lottery / 100 == guess % 100 / 10 || lottery / 100 == guess % 10) {
                bonus += 1000;
            }
            // second digit has match
            if(lottery % 100 / 10 == guess / 100 || lottery % 100 / 10 == guess % 100 / 10 || lottery % 100 / 10 == guess % 10) {
                bonus += 1000;
            }
            // third digit has match
            if(lottery % 10 == guess / 100 || lottery % 10 == guess % 100 / 10 || lottery % 10 == guess % 10) {
                bonus += 1000;
            }
            if (bonus == 0) {
                System.out.println("What a shame. You have not guess one right.");
            } else {
                System.out.println("Just so so. You guess " + bonus / 1000 + " digits right and bonus for you $" + bonus);
            }
        }
    }
}
