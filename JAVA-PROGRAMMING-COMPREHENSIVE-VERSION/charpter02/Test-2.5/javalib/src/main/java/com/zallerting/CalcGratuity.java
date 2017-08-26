package com.zallerting;

import java.util.Scanner;

public class CalcGratuity {
    public static void main(String[] args) {
        // Create a input stream
        Scanner input = new Scanner(System.in);
        // Prompt user to enter the subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate:");
        // Obtain the two input number
        int subtotal  = input.nextInt();
        int gratuityRate = input.nextInt();
        // Calculate the gratuity
        double gratuity = subtotal * gratuityRate / 100.0;
        double total = gratuity + subtotal;
        // Output the gratuity and total
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
