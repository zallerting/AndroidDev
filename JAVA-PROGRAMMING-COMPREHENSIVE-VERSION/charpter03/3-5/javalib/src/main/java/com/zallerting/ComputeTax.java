package com.zallerting;

import java.util.Scanner;

public class ComputeTax {
    static int identityStatus;
    static double salaryForTax, taxOfSalary;
    public static void main(String[] args) {
        // Create a Scanner as input scream
        Scanner input = new Scanner(System.in);

        // Prompt to enter two numbers
        System.out.print("Enter the identity status[0, 1, 2, 3] and salary: ");

        // Obtain the entered numbers
        identityStatus = input.nextInt();
        salaryForTax = input.nextDouble();

        // Check identity status, then respectively to calculate the tax
        if(identityStatus == 0) {
            if(salaryForTax >= 0 && salaryForTax <= 8350) {
                taxOfSalary = salaryForTax * 0.1;
            } else if(salaryForTax >= 8351 && salaryForTax <= 33950) {
                taxOfSalary = 8350 * 0.1 + (salaryForTax - 8350) * 0.15;
            } else if(salaryForTax >= 33951 && salaryForTax <= 52250) {
                taxOfSalary = 8350 * 0.1 + (33950 - 8350) * 0.15 + (salaryForTax - 33950) * 0.25;
            } else if(salaryForTax >= 52251 && salaryForTax <= 171550) {
                taxOfSalary = 8350 * 0.1 + (33950 - 8350) * 0.15 + (52250 - 33950) * 0.25
                        + (salaryForTax - 52250) * 0.28;
            } else if(salaryForTax >= 171551 && salaryForTax <= 372950) {
                taxOfSalary = 8350 * 0.1 + (33950 - 8350) * 0.15 + (52250 - 33950) * 0.25
                        + (171550 - 52250) * 0.28 + (salaryForTax - 171550) * 0.33;
            } else if(salaryForTax >= 372951) {
                taxOfSalary = 8350 * 0.1 + (33950 - 8350) * 0.15 + (52250 - 33950) * 0.25
                        + (171550 - 52250) * 0.28 + (372950 - 171550) * 0.33
                        + (salaryForTax - 372950) * 0.35;
            }
        } else if(identityStatus == 1) {
            if(salaryForTax >= 0 && salaryForTax <= 16700) {
                taxOfSalary = salaryForTax * 0.1;
            } else if(salaryForTax >= 16701 && salaryForTax <= 67900) {
                taxOfSalary = 16700 * 0.1 + (salaryForTax -16700) * 0.15;
            } else if(salaryForTax >= 67901 && salaryForTax <= 137050) {
                taxOfSalary = 16700 * 0.1 + (67900 - 16700) * 0.15 + (salaryForTax - 67900) * 0.25;
            } else if(salaryForTax >= 137051 && salaryForTax <= 208850) {
                taxOfSalary = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                        + (salaryForTax - 137050) * 0.28;
            } else if(salaryForTax >= 208851 && salaryForTax <= 372950) {
                taxOfSalary = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                        + (208850 - 137050) * 0.28 + (salaryForTax - 208850) * 0.33;
            } else if(salaryForTax >= 372951) {
                taxOfSalary = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                        + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33
                        + (salaryForTax - 372950) * 0.35;
            }
        } else if(identityStatus == 2) {
            if(salaryForTax >= 0 && salaryForTax <= 8350) {
                taxOfSalary = salaryForTax * 0.1;
            } else if(salaryForTax >= 8351 && salaryForTax <= 33950) {
                taxOfSalary = 8350 * 0.1 + (salaryForTax - 8350) * 0.15;
            } else if(salaryForTax >= 33951 && salaryForTax <= 68525) {
                taxOfSalary = 8350 * 0.1 + (33950 - 8350) * 0.15 + (salaryForTax - 33950) * 0.25;
            } else if(salaryForTax >= 68526 && salaryForTax <= 104425) {
                taxOfSalary = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25
                        + (salaryForTax - 68525) * 0.28;
            } else if(salaryForTax >= 104426 && salaryForTax <= 186475) {
                taxOfSalary = 8350 * 0.1 + (33950 - 8350) * 0.15 + (52250 - 33950) * 0.25
                        + (104425 - 68525) * 0.28 + (salaryForTax - 104425) * 0.33;
            } else if(salaryForTax >= 186476) {
                taxOfSalary = 8350 * 0.1 + (33950 - 8350) * 0.15 + (52250 - 33950) * 0.25
                        + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33
                        + (salaryForTax - 186475) * 0.35;
            }
        } else if(identityStatus == 3) {
            if(salaryForTax >= 0 && salaryForTax <= 11950) {
                taxOfSalary = salaryForTax * 0.1;
            } else if(salaryForTax >= 11951 && salaryForTax <= 45500) {
                taxOfSalary = 11950 * 0.1 + (salaryForTax - 11950) * 0.15;
            } else if(salaryForTax >= 45501 && salaryForTax <= 117450) {
                taxOfSalary = 11950 * 0.1 + (45500 - 11950) * 0.15 + (salaryForTax - 45500) * 0.25;
            } else if(salaryForTax >= 117451 && salaryForTax <= 190200) {
                taxOfSalary = 11950 * 0.1 + (45550 - 11950) * 0.15 + (117450 - 45500) * 0.25
                        + (salaryForTax - 117450) * 0.28;
            } else if(salaryForTax >= 190201 && salaryForTax <= 372950) {
                taxOfSalary = 11950 * 0.1 + (45550 - 11950) * 0.15 + (117450 - 45500) * 0.25
                        + (190200 - 117450) * 0.28 + (salaryForTax - 190200) * 0.33;
            } else if(salaryForTax >= 186476) {
                taxOfSalary = 11950 * 0.1 + (45550 - 11950) * 0.15 + (117450 - 45500) * 0.25
                        + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33
                        + (salaryForTax - 372950) * 0.35;
            }
        } else {
            System.out.println("Error: invalid identity status!");
            // program abnormal exit
            System.exit(1);
        }
        // Output the tax for the salary
        System.out.println("The tax for the salary $" + salaryForTax + " is " + taxOfSalary);
    }
}
