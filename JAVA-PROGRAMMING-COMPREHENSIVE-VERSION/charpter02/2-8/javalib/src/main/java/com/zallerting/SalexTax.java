package com.zallerting;

import java.util.Scanner;

public class SalexTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt to enter a phase amount
        System.out.print("Enter a phaseAmount: ");

        double phaseAmount = input.nextDouble();

        double tax = phaseAmount * 0.06;

        double salesAmount = (int)(tax * 100) / 100.0;

        System.out.println("Sales Tax is " + salesAmount);
    }
}
