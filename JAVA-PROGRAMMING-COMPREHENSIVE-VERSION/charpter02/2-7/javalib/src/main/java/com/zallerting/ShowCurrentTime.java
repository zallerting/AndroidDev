package com.zallerting;

public class ShowCurrentTime {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Obtain the current seconds in the minute in the hour
        int currentSeconds = (int)(totalSeconds % 60);

        //  Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Obtain the current minute in the hour
        int currentMinutes = (int)(totalMinutes % 60);

        // Obtain the total hours
        long totalHour = totalMinutes / 60;

        // Obtain the current hour
        int currentHour = (int)(totalHour % 24);

        //
        System.out.println("Current time is " + currentHour + ":" +
            currentMinutes + ":" + currentSeconds + " GMT");

    }
}
