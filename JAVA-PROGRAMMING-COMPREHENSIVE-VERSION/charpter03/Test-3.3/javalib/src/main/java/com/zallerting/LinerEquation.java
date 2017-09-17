package com.zallerting;

import java.util.Scanner;

public class LinerEquation {
    static double a, b, c, d, e, f, shortExpr, x, y;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter a, b, c , d, e, f
        System.out.print("Enter a, b, c, d, e, f: ");

        // Obtain the inputed a, b, c, d, e, f respectively
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        // Calculate the shortExpr
        shortExpr = a * d - b * c;

        // Check whether or not shortExpr is equal to 0
        if(shortExpr == 0) {
            System.out.println("The equation has no solution.");
        } else {
            // Calculate x and y
            x = (e * d - b * f) / shortExpr;
            y = (a * f - e * c) / shortExpr;
            System.out.println("The equation's result is: x = " + x + " and y = " + y );
        }

    }
}
