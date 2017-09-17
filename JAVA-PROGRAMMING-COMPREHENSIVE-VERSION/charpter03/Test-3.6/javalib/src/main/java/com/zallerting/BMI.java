package com.zallerting;

import java.util.Scanner;

public class BMI {
    static final double KILOGRAMS_PER_POUND = 0.45359237,
                        METERS_PER_INCH = 0.0254,
                        INCH_PER_FEET = 12;
    static double weight, height, bmi;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter weight
        System.out.print("Enter weight in pounds: ");
        // Obtain the inputed weight
        weight = input.nextDouble() * KILOGRAMS_PER_POUND;
        // Prompt to enter feet
        System.out.print("Enter height in feet: ");
        // Obtain the inputed height and convert to inches
        height = input.nextDouble() * INCH_PER_FEET * METERS_PER_INCH;
        // Prompt to enter inches
        System.out.print("Enter height in inches: ");
        // Obtain the inputed inches and convert to inches
        height += input.nextDouble() * METERS_PER_INCH;

        // Calculate the BMI
        bmi = weight / Math.pow(height, 2);
        System.out.print("BMI is " + bmi);

        // Check the figute status
        if(bmi < 18.5) {
            System.out.println(" and figure Underweight.");
        } else if(bmi < 25) {
            System.out.println(" and figure Normal.");
        } else if(bmi < 30) {
            System.out.println(" and figure Overweight.");
        } else {
            System.out.println(" and figure Obese.");
        }


    }
}
