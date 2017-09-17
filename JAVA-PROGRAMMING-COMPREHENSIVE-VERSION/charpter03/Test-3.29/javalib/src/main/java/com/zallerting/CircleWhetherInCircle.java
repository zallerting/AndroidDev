package com.zallerting;

import java.util.Scanner;

public class CircleWhetherInCircle {
    static double circle1_x,
                  circle1_y,
                  circle2_x,
                  circle2_y,
                  circle1_radius,
                  circle2_radius,
                  distanceBetweenCenters;
    public static void main(String[] args) {
        // Create a Scannera
        Scanner input1 = new Scanner(System.in);
        // Prompt to enter coordinates and radius
        System.out.print("Enter circle1's center x-, y-coordinates and radius: ");
        // Obtain the inputted coordinates and radius
        circle1_x = input1.nextDouble();
        circle1_y = input1.nextDouble();
        circle1_radius = input1.nextDouble();
        // Create a Scannera
        Scanner input2 = new Scanner(System.in);
        // Prompt to enter coordinates and radius
        System.out.print("Enter circle2's center x-, y-coordinates and radius: ");
        // Obtain the inputted coordinates and radius
        circle2_x = input2.nextDouble();
        circle2_y = input2.nextDouble();
        circle2_radius = input2.nextDouble();

        // Calculate the distance double centers
        distanceBetweenCenters = Math.pow(Math.pow(circle1_x - circle2_x, 2) +
                Math.pow(circle1_y - circle2_y, 2), 0.5);

        // Compare distance with radius
        if(distanceBetweenCenters <= Math.abs(circle1_radius - circle2_radius)) {
            System.out.println("circle2 is inside circle1.");
        } else if(distanceBetweenCenters <= circle1_radius + circle2_radius &&
                distanceBetweenCenters > Math.abs(circle1_radius - circle2_radius)) {
            System.out.println("circle2 overlaps circle1.");
        } else {
            System.out.println("circle2 does not overlap circle1.");
        }
    }
}
