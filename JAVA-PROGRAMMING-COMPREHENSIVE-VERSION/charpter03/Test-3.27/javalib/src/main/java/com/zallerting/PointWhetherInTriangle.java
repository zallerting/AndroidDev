package com.zallerting;

import java.util.Scanner;

public class PointWhetherInTriangle {
    static double coordinate_x, coordinate_y;
    static boolean isInTriangle;
    static final double MAX_X = 200,
                        MAX_Y = 100;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter the coordinates of point
        System.out.print("Enter a point's x- and y-coordinates: ");
        // Obtain the inputted coordinates
        //  -0.5 * x + 100 = y
        coordinate_x = input.nextDouble();
        coordinate_y = input.nextDouble();


        // Check point whether in rectangle
        isInTriangle = coordinate_x <= MAX_X && coordinate_x >= 0 &&
                       coordinate_y <= - 0.5 * coordinate_x + 100 && coordinate_y >= 0;
        if(isInTriangle == true) {
            System.out.println("The point is in the triangle.");
        } else {
            System.out.println("The point is not in the triangle.");
        }
    }
}
