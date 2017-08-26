package com.zallerting;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt input
        System.out.print("Enter a decimal double number, for example 11.56: ");
        // Obtain a double number
        double decimalDoubleNumber = input.nextDouble();
        // Convert decimal to int number for penny
        int remainingPenny = (int)(decimalDoubleNumber * 100);
        // Obtain dollors number
        int dollarsNumber = remainingPenny / 100;
        // Obtain remaining penny
        remainingPenny %= 100;
        // Obtain quarter number
        int quartersNUmber = (int)(remainingPenny / 25);
        // Obtain remaining penny
        remainingPenny %= 25;
        // Obtain dime number
        int dimeNumber = (int)(remainingPenny / 10);
        remainingPenny %= 10;
        // Obtain nickel number
        int nickelNumber = (int)(remainingPenny / 5);
        // Obtain penny number
        int pennyNumber  = remainingPenny % 5;

        System.out.println("Input number " + decimalDoubleNumber + " means: " +
            dollarsNumber + " dollars, " + quartersNUmber + " quarters, " +
            dimeNumber + " dimes, " + nickelNumber + " nickels, " + pennyNumber + " pennys.");

    }
}
