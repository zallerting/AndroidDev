package com.zallerting;

import java.util.Scanner;

public class BMI {
    static final double RATE_OF_POUND_TO_KILOGRAM = 0.45359237;
    static final double RATE_OF_INCH_TO_MILE = 0.0254;
    static double kilogram, mile, bmi;
    public static void main(String[] args) {
        // Create a input scream
        Scanner input_1 = new Scanner(System.in);
        // Prompt to enter a number of pounds
        System.out.print("Enter weight in pounds: ");
        // Calculate the kilogram
        kilogram = input_1.nextDouble() * RATE_OF_POUND_TO_KILOGRAM;

        // Create a input scream
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter a number of inches
        System.out.print("Enter weight in inches: ");
        // Calculate the mile
        mile = input_2.nextDouble() * RATE_OF_INCH_TO_MILE;

        // Calculate the BMI
        bmi = kilogram / Math.pow(mile, 2);

        // Output the result
        System.out.println(kilogram + " kilograms and " + mile + " miles, their BMI is " + bmi );

    }
}
