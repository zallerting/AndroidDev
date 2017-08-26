package com.zallerting;

import java.util.Scanner;

public class AmountDeposit {
    static double monthlySaveAmount, balanceFinal;
    static int monthAmount;
    static double MONTHLY_RATE  = 0.00417;
    public static void main(String[] args) {
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt to enter saving amount, monthAmount
        System.out.print("Enter the monthly saving amount and monthes: ");
        // Obtain the inputed numbers
        monthlySaveAmount = input.nextDouble();
        monthAmount = input.nextInt();
        // 等比数列求和公式: Sn = a1 * (1 - q ^ n) / (1 - q)
        balanceFinal = monthlySaveAmount * (1 + MONTHLY_RATE) * (1 - Math.pow(1 + MONTHLY_RATE, monthAmount)) / (1 - (1 + MONTHLY_RATE));
        // Output 月复利最终本息和
        System.out.println("After " + monthAmount + " monthes, the amount need to pay is $" + balanceFinal);
    }
}
