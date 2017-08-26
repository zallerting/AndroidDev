package com.zallerting;

import java.util.Scanner;

public class CalcEnergyConsume {
    public static void main(String[] args) {
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt to enter water amount
        System.out.print("Enter the amount of water in kilometers: ");
        // Obtain the inputted number
        double waterAmount = input.nextDouble();
        // Prompt to enter initial temperature
        System.out.print("Enter the initial temperature: ");
        // Obtain the inputted number
        double initialTemp = input.nextDouble();
        // Prompt to enter finial temperature
        System.out.print("Enter the final temperature: ");
        // Obtain the inputted number
        double finalTemp = input.nextDouble();
        // Calculate the needed energy to heat water
        double energyNeeded = waterAmount * (finalTemp - initialTemp) * 4184;
        // Output the result
        System.out.println("The energy needed is " + energyNeeded);
    }
}
