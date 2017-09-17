package com.zallerting;

import java.util.Scanner;

import sun.awt.AWTAccessor;

public class LocationOfDot {
    static double p0_x, p0_y, p1_x, p1_y, p2_x, p2_y, location;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter points' coordinates
        System.out.print("Enter three points' coordinates for p0, p1 and p2: ");
        // Obtain the points' coordinates
        p0_x = input.nextDouble();
        p0_y = input.nextDouble();
        p1_x = input.nextDouble();
        p1_y = input.nextDouble();
        p2_x = input.nextDouble();
        p2_y = input.nextDouble();

        // Calculate the location for p2
        location = (p1_x - p0_x) * (p2_y - p0_y) - (p2_x - p0_x) * (p1_y -p0_y);

        // Check location base on > 0, = 0 and < 0
        if(location > 0) {
            System.out.println("(" + p2_x + ", " + p2_y + ") is on the left side " +
                    "of the line from (" + p0_x + ", " + p0_y + ") to (" + p1_x + ", " +
                    p1_y + ")");
        } else if(location == 0) {
            System.out.println("(" + p2_x + ", " + p2_y + ") is on the line from ("
                    + p0_x + ", " + p0_y + ") to (" + p1_x + ", " + p1_y + ")");
        } else if(location < 0) {
            System.out.println("(" + p2_x + ", " + p2_y + ") is on the right side " +
                    "of the line from (" + p0_x + ", " + p0_y + ") to (" + p1_x + ", " +
                    p1_y + ")");
        }
    }
}
