package com.zallerting;

import java.util.Scanner;

public class CalcVolumeOfCylinder {
    static final double PI = 3.1415926;
    public static void main(String[] args) {
        // Obtain an inputstream
        Scanner input = new Scanner(System.in);
        // Prompt user to enter radius and height of a cylinder
        System.out.print("Enter the radius and height of a cylinder: ");
        // Obtain inputed radius
        double radius = input.nextDouble();
        // Obtain inputed height
        double height = input.nextDouble();
        // calculate the area of cylinder
        double area = radius * radius * PI;
        // calculate the volume of cylinder
        double volume = area * height;
        // Output the result
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
