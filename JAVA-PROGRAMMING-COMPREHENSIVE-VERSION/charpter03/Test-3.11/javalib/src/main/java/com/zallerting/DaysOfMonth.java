package com.zallerting;

import java.util.Scanner;

public class DaysOfMonth {
    static int month, year;
    static boolean isLeapYear;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt to enter the month and year
        System.out.print("Enter the month and the year: ");
        // Obtain the inputted month and year
        month = input.nextInt();
        year = input.nextInt();

        // Calculate whether or not a leap year
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Check whether month equals 2
        switch (month){
            // Feb
            case (2):
                // Check year is or not a leap year
                if(isLeapYear) {
                    // leap year
                    System.out.println("February, " + year + " has 28 days.");
                } else {
                    // not leap year
                    System.out.println("February, " + year + " has 29 days.");
                }
                break;
            // not Feb
            default:
                // Check year base on 1, 2, ..., 12
                switch (month){
                    case(1):
                        System.out.println("January, " + year + " has 31 days.");
                        break;
                    case(3):
                        System.out.println("March, " + year + " has 31 days.");
                        break;
                    case(4):
                        System.out.println("April, " + year + " has 30 days.");
                        break;
                    case(5):
                        System.out.println("May, " + year + " has 31 days.");
                        break;
                    case(6):
                        System.out.println("June, " + year + " has 30 days.");
                        break;
                    case(7):
                        System.out.println("July, " + year + " has 31 days.");
                        break;
                    case(8):
                        System.out.println("August, " + year + " has 31 days.");
                        break;
                    case(9):
                        System.out.println("September, " + year + " has 30 days.");
                        break;
                    case(10):
                        System.out.println("October, " + year + " has 31 days.");
                        break;
                    case(11):
                        System.out.println("November, " + year + " has 30 days.");
                        break;
                    case(12):
                        System.out.println("Dece,ber, " + year + " has 31 days.");
                        break;
                }
        }


    }
}
