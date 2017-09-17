package com.zallerting;

import java.util.Scanner;

public class DeliverCost {
    static double weight, cost;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter the luggage weight
        System.out.print("Enter the wight of luggage: ");
        // Obtain the inputted weight
        weight = input.nextDouble();
        if(weight > 0 && weight <= 1) {
            cost = 3.5;
        } else if(weight > 1 && weight <= 3) {
            cost = 5.5;
        } else if(weight > 3 && weight <= 10) {
            cost = 8.5;
        } else if(weight > 10 & weight <= 20) {
            cost = 10.5;
        }
        if(weight > 0 && weight <= 20) {
            System.out.println("The luggage's weight is " + weight + ", and its cost is " + cost);
        } else {
            System.out.println("Sorry, the luggage cannot be shipped");
        }

    }
}