package com.zallerting;

import java.util.Scanner;

public class CalcPopulation {
    static final double BIRTH_PERIOD = 7,
            DEAD_PERIOD = 13,
            MIGRATE_PERIOD = 45,
            SECOND_OF_YEAR = 365 * 24 * 60 * 60;
    static final long CURRENT_POPULATION = 312032486;
    static long target_year_population, difference_population;
    public static void main(String[] args) {
        //　每年人口变化数
        difference_population = (long)(SECOND_OF_YEAR / BIRTH_PERIOD - SECOND_OF_YEAR /
                    DEAD_PERIOD + SECOND_OF_YEAR / MIGRATE_PERIOD);
        // 当前人口数
        target_year_population = CURRENT_POPULATION;
        // Create a input scream
        Scanner input = new Scanner(System.in);
        // Prompt to enter the year number
        System.out.print("Enter the number of years: ");
        // Obtain the input year number
        int yearNumber = input.nextInt();
        // Calculate the inputted year's population
        for(int i = 0; i < yearNumber; i++) {
            target_year_population += difference_population;
        }
        System.out.println("No " + yearNumber + " year's population is " + target_year_population);
    }
}
