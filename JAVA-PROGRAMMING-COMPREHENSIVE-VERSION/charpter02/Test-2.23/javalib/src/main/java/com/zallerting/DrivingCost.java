package com.zallerting;

import java.util.Scanner;

public class DrivingCost {
    static double driveDistance, milesPerGallon, pricePerGallon, costOfDriving;
    public static void main(String[] args) {
        // Create a input scream
        Scanner input_1 = new Scanner(System.in);
        // Prompt to enter the driving distance
        System.out.print("Enter the driving distance: ");
        // Obtain the inputed driving distance
        driveDistance = input_1.nextDouble();

        // Create one more input scream
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter the miles per gallon consume
        System.out.print("Enter the miles per gallon consume: ");
        // Obtain the inputed miles per gallon consume
        milesPerGallon = input_2.nextDouble();

        // Create one more input scream
        Scanner input_3 = new Scanner(System.in);
        // Prompt to enter the price per gallon consume
        System.out.print("Enter the price per gallon consume: ");
        // Obtain the inputed price per gallon consume
        pricePerGallon = input_3.nextDouble();

        // Calculate the cost of driving
        costOfDriving = (driveDistance / milesPerGallon)* pricePerGallon;

        // Output the result
        System.out.println("The cost of driving is $" + costOfDriving);

    }
}
