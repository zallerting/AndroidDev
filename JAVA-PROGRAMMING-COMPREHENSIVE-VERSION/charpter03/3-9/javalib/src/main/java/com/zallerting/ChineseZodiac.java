package com.zallerting;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt to enter a year number
        System.out.print("Enter a year number: ");

        // Obtain the inputed year number
        int yearNum = input.nextInt();

        // Check which zodiac of 12 animals
        switch(yearNum % 12) {
            case 0:
                System.out.println(yearNum + " is monkey year");
                break;
            case 1:
                System.out.println(yearNum + " is rooster year");
                break;
            case 2:
                System.out.println(yearNum + " is dog year");
                break;
            case 3:
                System.out.println(yearNum + " is pig year");
                break;
            case 4:
                System.out.println(yearNum + " is rat year");
                break;
            case 5:
                System.out.println(yearNum + " is ox year");
                break;
            case 6:
                System.out.println(yearNum + " is tiger year");
                break;
            case 7:
                System.out.println(yearNum + " is rabbit year");
                break;
            case 8:
                System.out.println(yearNum + " is dragon year");
                break;
            case 9:
                System.out.println(yearNum + " is snake year");
                break;
            case 10:
                System.out.println(yearNum + " is horse year");
                break;
            case 11:
                System.out.println(yearNum + " is sheep year");
                break;
        }
    }
}
