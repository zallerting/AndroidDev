package com.zallerting;

import java.util.Scanner;

public class MoneyExchange {
    static double decimalDoubleNumber;
    static int remainingPenny, dollarDigit, quarterDigit, dimeDigit, nickelDigit, pennyDigit;
    static String dollarStr, quarterStr, dimeStr, nickleStr, pennyStr;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt input
        System.out.print("Enter a decimal double number, for example 11.56: ");
        // Obtain a double number
        decimalDoubleNumber = input.nextDouble();
        // Convert decimal to int number for penny
        remainingPenny = (int)(decimalDoubleNumber * 100);
        // Obtain dollors number
        dollarDigit = remainingPenny / 100;
        // Obtain remaining penny
        remainingPenny %= 100;
        // Obtain quarter number
        quarterDigit = (int)(remainingPenny / 25);
        // Obtain remaining penny
        remainingPenny %= 25;
        // Obtain dime number
        dimeDigit = (int)(remainingPenny / 10);
        remainingPenny %= 10;
        // Obtain nickel number
        nickelDigit = (int)(remainingPenny / 5);
        // Obtain penny number
        pennyDigit  = remainingPenny % 5;
        
        // 1.Check Digit whether or not is equal to 0, if true ,override its printing;
        // 2.Check Digit whether or not is larger then 1, if true then add 's' for suffix.

        dollarStr = (dollarDigit == 0) ? "" : (dollarDigit == 1) ? dollarDigit + " dollar, " : dollarDigit + " dollars, ";
        quarterStr = (quarterDigit == 0) ? "" : (quarterDigit == 1) ? quarterDigit + " quarter, " : quarterDigit + " quarters, ";
        dimeStr = (dimeDigit == 0) ? "" : (dimeDigit == 1) ? dimeDigit + " dime, " : dimeDigit + " dimes, ";
        nickleStr = (nickelDigit == 0) ? "" : (nickelDigit == 1) ? nickelDigit + " nickle, " : nickelDigit + " nickles, ";
        pennyStr = (pennyDigit == 0) ? "" : (pennyDigit == 1) ? pennyDigit + " penny, " : pennyDigit + " pennies, ";

        System.out.println("Input number " + decimalDoubleNumber + " means: " +
                dollarStr + quarterStr + dimeStr + nickleStr + pennyStr);
    }
}
