package com.zallerting;

import java.util.Scanner;

public class QuadraticEquation {
    static double a, b, c, checkEquation, r1, r2, result;
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter a, b, c
        System.out.print("Enter a, b, c: ");

        // Obtain the inputed a, b and c respectively
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // Calculate checkEquation, r1 and r2 respectively
        checkEquation = Math.pow(b, 2) - a * c * 4;

        // Check checkEquation whether or not large than 0
        if(checkEquation > 0) {
            r1 = (-b + Math.pow(checkEquation, 0.5)) / (a * 2);
            r2 = (-b - Math.pow(checkEquation, 0.5)) / (a * 2);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if(checkEquation == 0) {
            r1 = -b / (a * 2);
            r2 = r1;
            System.out.println("The equation has one root: " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
