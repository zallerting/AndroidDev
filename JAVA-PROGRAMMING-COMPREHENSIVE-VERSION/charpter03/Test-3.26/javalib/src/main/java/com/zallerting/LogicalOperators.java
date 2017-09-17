package com.zallerting;

import java.util.Scanner;

public class LogicalOperators {
    static int intNum;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter an integer
        System.out.print("Enter an integer: ");
        // Obtain the inputted integer
        intNum = input.nextInt();

        // Verify and output the results
        System.out.println("Is " + intNum + " divisible by 5 " +
                "and 6? " + (intNum % 5 == 0 && intNum % 6 == 0));
        System.out.println("Is " + intNum + " divisible by 5 " +
                "or 6? " + (intNum % 5 == 0 || intNum % 6 == 0));
        System.out.println("Is " + intNum + " divisible by 5 " +
                "or 6, but not both? " + (intNum % 5 == 0 ^ intNum % 6 == 0));
    }
}
