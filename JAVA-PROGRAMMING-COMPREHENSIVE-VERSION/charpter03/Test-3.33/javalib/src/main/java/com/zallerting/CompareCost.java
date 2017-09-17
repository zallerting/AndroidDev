package com.zallerting;

import java.util.Scanner;

public class CompareCost {
    static double weight_1, price_1,
                  weight_2, price_2,
                  cost_1, cost_2;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input_1 = new Scanner(System.in);
        // Prompt to enter weight and price for package 1
        System.out.print("Enter weight and price for package 1: ");
        // Obtain the inputted weight and price for package 1
        weight_1 = input_1.nextDouble();
        price_1 = input_1.nextDouble();
        // Create another Scanner
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter weight and price for package 1
        System.out.print("Enter weight and price for package 2: ");
        // Obtain the inputted weight and price for package 2
        weight_2 = input_2.nextDouble();
        price_2 = input_2.nextDouble();

        // Calculate the cost for package 1 and 2 respectively
        cost_1 = price_1 / weight_1;
        cost_2 = price_2 / weight_2;

        // Compare the cost between package 1 and 2
        if(cost_1 > cost_2) {
            System.out.println("Package 2 has a better price.");
        } else if(cost_1 < cost_2) {
            System.out.println("Package 1 has a better price.");
        } else if(cost_1 == cost_2) {
            System.out.println("Two packages have the same price.");
        }
    }
}
