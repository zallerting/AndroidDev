package com.zallerting;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        // Calculate minutes in seconds
        int minutes = seconds / 60;
        // Calculate seconds remainings;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes +
            " minutes and " + remainingSeconds + " seconds.");

    }
}
