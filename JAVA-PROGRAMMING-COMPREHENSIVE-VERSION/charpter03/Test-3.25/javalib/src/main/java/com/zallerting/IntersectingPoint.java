package com.zallerting;

import java.util.Scanner;

public class IntersectingPoint {
    static double x1, y1, x2, y2, x3, y3, x4, y4, d, d1, d2;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter three points' coordinates
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        // Obtain the inputted three points' coordinates
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        x4 = input.nextDouble();
        y4 = input.nextDouble();

        // Calculate by Gammar regulation
        d = (y1 - y2) * (x4 - x3)  - (y3 - y4) * (x2 -  x1);
        d1 =((y1 - y2) * x1 - (x1 - x2) * y1) * (x4 - x3) -
                ((y3 - y4) * x3 - (x3 - x4) * y3) * (x2 - x1);
        d2 = (y1 - y2) * ((y3 - y4) * x3 - (x3 - x4) * y3) -
                (y3 - y4) * ((y1 - y2) * x1 - (x1 - x2) * y1);

        if(d != 0) {
            System.out.println("The intersecting point is at ("
                    + d1 / d + ", " + d2 / d + ").");
        } else {
            System.out.println("The two lines are parallel.");
        }

    }
}
