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
        System.out.print("Enter the wind speed (>= 2 miles/hour): ");
        // Obtain the number as speed
        double speed = input_2.nextDouble();

        // Check whether the inputted temperature and speed is appropriate
        if(temperature >= -58 && temperature <= 41 && speed >= 2) {
            // Calculate the wind chill temperature
            double windChillTemperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
                    + 0.4275 * temperature * Math.pow(speed, 0.16);
            // Output the result
            System.out.println("The wind chill index with temperature " + temperature + "℉ and wind speed "
                    + speed + " miles/hour is " + windChillTemperature);
        }
        if(temperature < -58 || temperature > 41){
            System.out.println("The inputted temperature " + temperature + "℉ is " +
                    "inconsequent. ");
        }
        if(speed < 2) {
            System.out.println("The inputted chill speed " + speed + " miles/hour is " +
                    "inconsequent. ");
        }
    }
}