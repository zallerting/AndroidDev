package com.zallerting;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter a year number
        System.out.print("Enter a year: ");

        // Obtain the inputed year number
        long year = input.nextLong();

        // Check whether inputed year is or not a leap year
        boolean result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        // Output the result
        System.out.println(year + " is a leap year ? " + result);
    }
}
