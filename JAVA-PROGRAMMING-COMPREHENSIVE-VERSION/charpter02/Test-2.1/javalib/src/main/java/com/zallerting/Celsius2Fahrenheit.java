package com.zallerting;

import java.util.Scanner;

public class Celsius2Fahrenheit {
    public static void main(String[] args) {
        // Obtain a input stream
        Scanner input = new Scanner(System.in);
        // Prompt to enter a number for celsius
        System.out.print("Enter a degree in Celsius: ");
        // Obtain an input with double number
        double celsius = input.nextDouble();
        // Convert celsius to fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;
        // Output the result with fahrenheit
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
    }
}
