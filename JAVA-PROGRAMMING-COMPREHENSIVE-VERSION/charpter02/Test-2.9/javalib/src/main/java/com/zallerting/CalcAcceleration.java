package com.zallerting;

import java.util.Scanner;

public class CalcAcceleration {
    public static void main(String[] args) {
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt user to input the number by blank separate
        System.out.print("Enter v0, v1 and t: ");
        // Obtain the input three numbers
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        // Calculate the average acceleration speed
        double averageAccelerationSpeed = (v1 - v0) / t;
        // Output the result
        System.out.println("The average acceleration is " + averageAccelerationSpeed);
    }
}
