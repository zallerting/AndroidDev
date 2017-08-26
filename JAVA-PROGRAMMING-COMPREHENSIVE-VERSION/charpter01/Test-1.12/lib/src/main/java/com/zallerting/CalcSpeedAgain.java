package com.zallerting;

public class CalcSpeedAgain {
    static final double period = 1 + 40.0 / 60.0;
    static final double distanceByMile = 24.0;
    static double distanceByKm = distanceByMile * 1.6;
    public  static void main(String[] args) {
        System.out.println("The speed is " + distanceByKm / period + " km/h.");
    }
}
