package com.zallerting;

import java.util.Scanner;

public class DayOfWeek {
    static int year, month, dayOfMonth, dayOfWeek, century, yearOfCentury;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input_1 = new Scanner(System.in);
        // Prompt to enter year
        System.out.print("Enter year: (e.g., 2012): ");
        // Obtain the inputted year
        year = input_1.nextInt();
        // Create a Scanner
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter month
        System.out.print("Enter month: 1 - 12: ");
        // Obtain the inputted month
        month = input_2.nextInt();
        // Create a Scanner
        Scanner input_3 = new Scanner(System.in);
        // Prompt to enter day of month
        System.out.print("Enter the day of the month: 1 - 31: ");
        // Obtain the inputted day of month
        dayOfMonth = input_3.nextInt();

        // When the inputted month is 1 or 2, then convert month to
        // 13 or 14 respectively, year should be subtracted 1 simultaneously
        if(month == 1 || month == 2) {
            month += 12;
            year--;
        }

        // Calculate the century, year of century and day of week
        century = year / 100;
        yearOfCentury = year % 100;
        dayOfWeek = (dayOfMonth + (month + 1) * 26 / 10 + yearOfCentury
                + yearOfCentury / 4 + century / 4 + century * 5) % 7;

        // Check day of week by its English name
        switch(dayOfWeek){
            case(1):
                // Output the result
                System.out.println("Day of week is Sunday.");
                break;
            case(2):
                // Output the result
                System.out.println("Day of week is Monday.");
                break;
            case(3):
                // Output the result
                System.out.println("Day of week is Tuesday.");
                break;
            case(4):
                // Output the result
                System.out.println("Day of week is Wednesday.");
                break;
            case(5):
                // Output the result
                System.out.println("Day of week is Thursday.");
                break;
            case(6):
                // Output the result
                System.out.println("Day of week is Friday.");
                break;
            default:
                // Output the result
                System.out.println("Day of week is Saturday.");
                break;
        }
    }
}