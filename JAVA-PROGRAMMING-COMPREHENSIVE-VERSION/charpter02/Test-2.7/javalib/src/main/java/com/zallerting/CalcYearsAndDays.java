package com.zallerting;

import java.util.Scanner;

public class CalcYearsAndDays {
    public static void main(String[] args) {
        // Keyin a input stream
        Scanner input = new Scanner(System.in);
        // Prompt user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        // Obtain a input number as minutes
        long minutes = input.nextLong();
        // Calculate years
        long years = minutes / (60 * 24 * 365);
        // Calculate days
        int days = (int)(minutes % (60 * 24 * 365) / 60 / 24);
        // Print the years and days
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
