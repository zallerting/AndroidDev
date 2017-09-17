package com.zallerting;

import java.util.Scanner;

public class CircleOfTriangle {
    static double side_1, side_2, side_3, circle;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter the length of three sides
        System.out.print("Enter three sides' length respectively: ");
        // Obtain the inputted sides' length
        side_1 = input.nextDouble();
        side_2 = input.nextDouble();
        side_3 = input.nextDouble();

        // Check the inputted sides' length can or not been one triangle
        if(side_1 + side_2 > side_3 && Math.abs(side_1 - side_2) < side_3) {
            circle = side_1 + side_2 + side_3;
            System.out.println(side_1 + ", " + side_2 + ", " + side_3 + " can been a triangle," +
                    " and its circle is " + circle);
        } else {
            System.out.println(side_1 + ", " + side_2 + ", " + side_3 + " can't been a triangle.");
        }
    }
}
