package com.zallerting;

import java.util.Scanner;

public class PointWhetherInCIrcle {
    static double coordinate_x, coordinate_y, lengthToDot;
    static final double LENGTH_OF_RADIUS = 10;
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter the coordinate, e.g., (x, y)
        System.out.print("Enter the point coordinate: ");
        // Obtain the point coordinate
        coordinate_x = input.nextDouble();
        coordinate_y = input.nextDouble();

        // Calculate the length of point to dot
        lengthToDot = Math.pow(coordinate_x * coordinate_x + coordinate_y * coordinate_y, 0.5);

        // Check whether the inputted coordinate's point is in circle(9, 9)
        if(lengthToDot <= LENGTH_OF_RADIUS) {
            System.out.println("Coordinate (" + coordinate_x + ", " + coordinate_y + ") is " +
                    "in circle(9.0, 9.0).");
        } else {
            System.out.println("Coordinate (" + coordinate_x + ", " + coordinate_y + ") is not " +
                    "in circle(9.0, 9.0).");
        }
    }
}
