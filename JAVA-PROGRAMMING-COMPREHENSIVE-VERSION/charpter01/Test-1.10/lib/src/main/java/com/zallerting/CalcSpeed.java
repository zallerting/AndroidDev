package com.zallerting;

public class CalcSpeed {
    static double kilometer = 0.0,
                  mile = 0.0;
    static final double PERIOD  = 45.5 / 60;
    public static void main(String[] args) {
        kilometer = 14;
        try {
            mile = 1.6 * kilometer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("speed is " + mile / PERIOD + " mile/h.");

    }
}
