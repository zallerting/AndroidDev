package com.zallerting;

import java.util.Scanner;

public class WeekdayOfFuture {
    static int dayNumOfToday, numOfDaysElapsed, dayInFuture;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter a integer between 0 to 6;
        System.out.print("Enter today's day: ");

        // Obtain the inputed today's day number
        dayNumOfToday = input.nextInt();

        // Prompt to enter the number of days elapsed since today
        System.out.print("Enter the number of days elapsed since today: ");

        // Obtain the inputed elapsed days
        numOfDaysElapsed = input.nextInt();

        // Calculate the day number in the future
        dayInFuture = (numOfDaysElapsed + dayNumOfToday) % 7;

        switch (dayNumOfToday) {
            case(0):
                System.out.print("Today is Sunday ");
                break;
            case(1):
                System.out.print("Today is Monday ");
                break;
            case(2):
                System.out.print("Today is Tuesday ");
                break;
            case(3):
                System.out.print("Today is Wednesday ");
                break;
            case(4):
                System.out.print("Today is Thursday ");
                break;
            case(5):
                System.out.print("Today is Friday ");
                break;
            case(6):
                System.out.print("Today is Saturday ");
                break;
        }
        switch (dayInFuture) {
            case(0):
                System.out.print(" and the future day is Sunday ");
                break;
            case(1):
                System.out.print(" and the future day Monday ");
                break;
            case(2):
                System.out.print(" and the future day Tuesday ");
                break;
            case(3):
                System.out.print(" and the future day Wednesday ");
                break;
            case(4):
                System.out.print(" and the future day Thursday ");
                break;
            case(5):
                System.out.print(" and the future day Friday ");
                break;
            case(6):
                System.out.print(" and the future day Saturday ");
                break;
        }
    }
}
