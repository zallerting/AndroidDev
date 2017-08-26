package com.zallerting;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt to enter the balance and interest rate
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        // Obtain the inputed numbers
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        // Calculate the interest for next month
        double interestForNextMonth = balance * (interestRate / 1200);
        // Output the result
        System.out.println("The interest for balance " + balance + " and interest rate " + interestRate + " is " + interestForNextMonth);
    }
}
