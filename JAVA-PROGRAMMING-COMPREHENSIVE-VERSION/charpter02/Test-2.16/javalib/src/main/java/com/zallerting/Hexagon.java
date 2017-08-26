package com.zallerting;

import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt to enter the number for side
        System.out.print("Enter the side: ");
        // Obtain the inputed number
        double side = input.nextDouble();
        // Calculate the area of hexagon
        double hexagon = 3 * Math.pow(3, 0.5) / 2 * Math.pow(side, 2);
        // Output the result
        System.out.println("The area of hexagon of the side " + side + " is " + hexagon);
    }
}
