package com.zallerting;

public class CalcPopulation {
    static final double BIRTH_PERIOD = 7,
                     DEAD_PERIOD = 13,
                     MIGRATE_PERIOD = 45,
                     SECOND_OF_YEAR = 365 * 24 * 60 * 60;
    static final long CURRENT_POPULATION = 312032486;
    static long first_year_population,
                second_year_population,
                third_year_population,
                fourth_year_population,
                fifth_year_population,
                difference_population;
    public static void main(String[] args) {
        difference_population = (long)(SECOND_OF_YEAR / BIRTH_PERIOD - SECOND_OF_YEAR /
                DEAD_PERIOD + SECOND_OF_YEAR / MIGRATE_PERIOD);
        first_year_population = CURRENT_POPULATION + difference_population;
        second_year_population = first_year_population + difference_population;
        third_year_population = second_year_population + difference_population;
        fourth_year_population = third_year_population + difference_population;
        fifth_year_population = fourth_year_population + difference_population;

        System.out.println("1st year's population is " + first_year_population);
        System.out.println("2nd year's population is " + second_year_population);
        System.out.println("3rd year's population is " + third_year_population);
        System.out.println("4th year's population is " + fourth_year_population);
        System.out.println("5th year's population is " + fifth_year_population);
    }


}
