package com.zallerting;

import java.util.Scanner;

public class Pound2Kilogram {
    public static void main(String[] args) {
        // Obtain an inputstream
        Scanner input = new Scanner(System.in);
        // Prompt user to enter a pounds value
        System.out.print("Enter a number in pounds: ");
        // Obtain inputed pounds value
        double pounds = input.nextDouble();
        // Convert pounds to klometers
        double kilometers = pounds * 0.454;
        // Print the output result
        System.out.println(pounds + " pounds is " + kilometers + " kilometers");
    }
}
