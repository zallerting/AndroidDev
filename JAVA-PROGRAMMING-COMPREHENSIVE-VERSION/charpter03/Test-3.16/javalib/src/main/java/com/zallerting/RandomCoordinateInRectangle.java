package com.zallerting;

public class RandomCoordinateInRectangle {
    static int randomX, randomY;
    public static void main(String[] args) {
        // Generate one random integer between 0 to 100,
        // another random integer between 0 to 200.
        randomX = (int)(Math.random() * 101);
        randomY = (int)(Math.random() * 201);

        // Output the result
        System.out.println("Coordinate of rectangle is [" + randomX + ", " + randomY + "].");
    }
}
