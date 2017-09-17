package com.zallerting;

import java.util.Scanner;

public class PointWhetherInRectangle {
    static double coordinate_x, coordinate_y, lengthToDot;
    static final double MAX_LENGTH = 10 / 2,
                        MIN_LENGTH = 5.0 / 2;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter a point with coordinates
        System.out.print("Enter a point with two coordinates: ");
        // Obtain the coordinates
        coordinate_x = input.nextDouble();
        coordinate_y = input.nextDouble();
        
        // Calculate length to dot
        lengthToDot = Math.pow( Math.pow(coordinate_x, 2) + Math.pow(coordinate_y, 2), 0.5);

        // Calculate dot is whether r not in the rectangle
        if(lengthToDot >= MIN_LENGTH && lengthToDot <= MAX_LENGTH) {
            System.out.println("Coordinate (" + coordinate_x + ", " + coordinate_y
                + ") is in the rectangle");
        } else {
            System.out.println("Coordinate (" + coordinate_x + ", " + coordinate_y
                    + ") is not in the rectangle");
        }
    }
}
