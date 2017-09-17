package com.zallerting;

import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        // Create a input scream
        Scanner input_1 = new Scanner(System.in);
        // Prompt to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit between -58℉ and 41℉: ");
        // Obtain the number as temperature
        double temperature = input_1.nextDouble();
        // Create one more input scream
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter the wind speed
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        // Obtain the number as speed
        double speed = input_2.nextDouble();

        // Calculate the wind chill temperature
        double windChillTemperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
                + 0.4275 * temperature * Math.pow(speed, 0.16);

        // Output the result
        System.out.println("The wind chill index with temperature " + temperature + "℉ and wind speed "
                + speed + " mph is " + windChillTemperature);

    }
}