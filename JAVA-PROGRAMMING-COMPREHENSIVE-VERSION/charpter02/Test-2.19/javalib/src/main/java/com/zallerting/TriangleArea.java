package com.zallerting;

import java.util.Scanner;

public class TriangleArea {
    static double x1, x2, x3, y1, y2, y3, s, s1, s2, s3, area;
    public static void main(String[] args) {
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt to enter the coordinate of three points
        System.out.print("Enter three points for a triangle: ");
        // Obtain the inputed coordinate
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        // Calculate the area of triangle
        s1 = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
        s2 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        s3 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
        s = (s1 + s2 + s3) / 2;
        area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);
        // Output the result
        System.out.println("Coordinate [" + x1 + ", " + y1 + "], [" + x2 + ", " + y2 + "], ["
                + x3 + ", " + y3 + "], " + " its area of the triangle is " + area);
    }
}
