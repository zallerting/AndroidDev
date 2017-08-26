package com.zallerting;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        // Obtain a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter anual interst rate.., e.g. 5.75%: ");

        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Obtain number of years
        System.out.print("Enter number of years.., e.g. 5: ");
        int numOfYears = input.nextInt();

        // Obtain loan amount
        System.out.print("Enter loan amount.. e.g., 12000.95: ");
        double loanAmount = input.nextDouble();

        // Calculate payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - 1 / Math.pow(1+monthlyInterestRate, numOfYears * 12));
        double yearlyPayment = monthlyPayment * numOfYears * 12;

        // Display results
        System.out.println("Yearly Payment is " + (int)(yearlyPayment * 100) / 100.0);

        System.out.println("Monthly Payment is " + (int)(monthlyPayment * 100) / 100.0);


    }
}
