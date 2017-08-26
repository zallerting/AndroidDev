package com.zallerting;

import java.util.Scanner;

public class OverrideTest2_3 {
    static int monthlySaveAmount, balanceFinal, balanceFinalDollar, balanceFinalCent;
    static int monthAmount;
    static double MONTHLY_RATE  = 0.00417;
    public static void main(String[] args) {
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt to enter saving amount, monthAmount
        System.out.print("Enter the monthly saving amount and monthes: ");
        // Obtain the inputed save amount, regards it as cents
        monthlySaveAmount = input.nextInt();
        // Obtain the inputed month amount
        monthAmount = input.nextInt();
        // 等比数列求和公式: Sn = a1 * (1 - q ^ n) / (1 - q),求出的结果为美分数
        balanceFinal = (int)(monthlySaveAmount * (1 + MONTHLY_RATE) * (1 - Math.pow(1 + MONTHLY_RATE, monthAmount))
                / (1 - (1 + MONTHLY_RATE)));
        // Convert balanceFinal to balanceFinalDollar and balanceFinalCent
        balanceFinalDollar = balanceFinal / 100;
        balanceFinalCent = balanceFinal % 100;
        // Output 月复利最终本息和
        System.out.println("After " + monthAmount + " monthes, the amount need to pay is " + balanceFinalDollar +
                " dollars and " + balanceFinalCent + " cents.");
    }
}
