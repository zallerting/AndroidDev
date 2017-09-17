package com.zallerting;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    static double pounds, inches, kilograms, meters, BMI;
    static final double KILOGRAM_PER_POUND = 0.45359237,
                        METER_PER_INCH = 0.0254;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds and height in inches
        System.out.print("Enter weight by pound and height by inch: ");

        // Obtain the entered two numbers
        pounds = input.nextDouble();
        inches = input.nextDouble();

        // Convert pounds to kilograms and inches to meters;
        kilograms = pounds * KILOGRAM_PER_POUND;
        meters = inches * METER_PER_INCH;

        // Calculate the BMI
        BMI = kilograms / Math.pow(meters, 2);

        // Check health status
        if(BMI < 18.5) {
            System.out.println("Underweight");
        } else if(BMI < 25.0 && BMI >= 18.5) {
            System.out.println("Normal");
        } else if(BMI < 30.0 && BMI >= 25.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
