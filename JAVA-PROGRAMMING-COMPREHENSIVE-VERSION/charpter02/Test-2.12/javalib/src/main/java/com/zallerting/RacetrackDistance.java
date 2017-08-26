package com.zallerting;

import java.util.Scanner;

public class RacetrackDistance {
    static double velocity, acceleration, distance;
    public static void main(String[] args) {
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt to enter speed and acceleration
        System.out.print("Enter speed and acceleration: ");
        // Obtain the input velocity and acceleration
        velocity = input.nextDouble();
        acceleration = input.nextDouble();
        distance = velocity * velocity / (2 * acceleration);
        // Output the result
        System.out.println("The minimum runway length for this airplane is $" + distance);

    }
}
