package com.zallerting;

import java.util.Scanner;

public class Inch2Meter {
    public static void main(String[] args) {
        // Obtain an inputstream
        Scanner input = new Scanner(System.in);
        // Prompt user to enter feet value
        System.out.print("Enter a value for feet: ");
        // Obtain input feet value
        double feet = input.nextDouble();
        // Convert feet to meter
        double meter = feet * 0.305;
        // Print the output result
        System.out.println(feet + " feet is " + meter + " meters");
    }
}
