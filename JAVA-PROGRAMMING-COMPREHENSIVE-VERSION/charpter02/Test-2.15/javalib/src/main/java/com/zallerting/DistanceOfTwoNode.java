package com.zallerting;

import java.util.Scanner;

public class DistanceOfTwoNode {
    static double x1, y1, x2, y2, distance_of_two_nodes;
    public static void main(String[] args) {
        // Create a input scream
        Scanner input_1 = new Scanner(System.in);
        // Prompt to enter coordinate of 1st node
        System.out.print("Enter x1 and y1 of 1st node: ");
        // Obtain the two input numbers
        x1 = input_1.nextDouble();
        y1 = input_1.nextDouble();

        // Create a input scream
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter coordinate of 2nd node
        System.out.print("Enter x1 and y1 of 2nd node: ");
        // Obtain the two input numbers
        x2 = input_2.nextDouble();
        y2 = input_2.nextDouble();

        // Calculate the distance
        distance_of_two_nodes = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2), 0.5);

        // Output the result
        System.out.println("distance of first node[" + x1 + ", " + y1 + "] and second node[" + x2 + ", " + y2 + "] is " + distance_of_two_nodes);
    }
}
