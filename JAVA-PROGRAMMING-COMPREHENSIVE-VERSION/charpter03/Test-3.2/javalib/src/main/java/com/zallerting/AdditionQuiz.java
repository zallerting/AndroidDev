package com.zallerting;

import java.util.Scanner;

public class AdditionQuiz {
    static double num_1, num_2, num_3, guess, addition;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input_1 = new Scanner(System.in);
        
        // Prompt to enter three numbers respectively
        System.out.print("Enter three numbers respectively: ");
        
        // Obtain the input_1ed three numbers 
        num_1 = input_1.nextDouble();
        num_2 = input_1.nextDouble();
        num_3 = input_1.nextDouble();
        
        // Create another  Scanner
        Scanner input_2 = new Scanner(System.in);

        // Prompt to enter the guess addition result
        System.out.print("What is the addition of " + num_1 + " + "
             + num_2 + " + " + num_3 + " = ? " );

        // Obtain the guess number
        guess = input_2.nextDouble();

        // Calculate the real addition of these three numbers
        addition = num_1 + num_2 + num_3;

        // Print the guess result
        if(guess == addition) {
            System.out.println("Congratulations, you guess rightly.");
        } else {
            System.out.println("Sorry, you guess wrongly.");
        }
    }
}
