package com.zallerting;

import java.util.Scanner;

public class FutureInvestAmount {
    public static void main(String[] args) {
        // Create a input scream
        Scanner input_１ = new Scanner(System.in);
        // Prompt to enter investment amount
        System.out.print("Enter investment amount:");
        // Obtain the inputed amount
        double investAmount = input_１.nextDouble();

        // Create one more input scream
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter annual interest rate
        System.out.print("Enter annual interest rate in percentage: ");
        // Obtain the inputed amount
        double annualInterestRate = input_2.nextDouble();

        // Create one more input scream
        Scanner input_3 = new Scanner(System.in);
        // Prompt to enter number of years
        System.out.print("Enter number of years: ");
        // Obtain the inputed amount
        double numOfYears = input_3.nextDouble();

        // Calculate the future investment amount
        double futureInvestAmount = investAmount * Math.pow(1 + annualInterestRate / 1200, numOfYears * 12);

        // Output the result
        System.out.println("Accumulated value is $" + futureInvestAmount);

    }
}
