package com.zallerting;

import java.util.Scanner;

public class DoubleTriangleLocation {
    static double coordinate_x1,
                  coordinate_y1,
                  coordinate_x2,
                  coordinate_y2,
                  width_rec1,
                  height_rec1,
                  width_rec2,
                  height_rec2,
                  rec2_x1,
                  rec2_y1,
                  rec2_x2,
                  rec2_y2,
                  rec2_x3,
                  rec2_y3,
                  rec2_x4,
                  rec2_y4;
    static boolean is_rec2_in_rec1_p1,
                   is_rec2_in_rec1_p2,
                   is_rec2_in_rec1_p3,
                   is_rec2_in_rec1_p4;
    static int times;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input_1 = new Scanner(System.in);
        // Prompt to enter center coordinates, width and height of rectangle
        System.out.print("Enter r1's center x-, y-coordinate, width and height: ");
        // Obtain the inputted coordinates, width and height
        coordinate_x1 = input_1.nextDouble();
        coordinate_y1 = input_1.nextDouble();
        width_rec1 = input_1.nextDouble();
        height_rec1 = input_1.nextDouble();
        // Create another Scanner
        Scanner input_2 = new Scanner(System.in);
        // Prompt to enter center coordinates, width and height of rectangle
        System.out.print("Enter r2's center x-, y-coordinate, width and height: ");
        // Obtain the inputted coordinates, width and height
        coordinate_x2 = input_2.nextDouble();
        coordinate_y2 = input_2.nextDouble();
        width_rec2 = input_2.nextDouble();
        height_rec2 = input_2.nextDouble();
        
        // 只有r2对应矩形的四个角的坐标都在r1对应矩形内时，才满足r2对应矩形在r1对应矩形内
        // 分别求出r2对应矩形的四个角的坐标是否在(width_rec1, 0)与(0, height_rec1)构成的矩形内
        rec2_x1 = Math.abs(coordinate_x2 - width_rec2 / 2);
        rec2_y1 = Math.abs(coordinate_y2 - height_rec2 / 2);
        rec2_x2 = Math.abs(coordinate_x2 + width_rec2 / 2);
        rec2_y2 = Math.abs(coordinate_y2 - height_rec2 / 2);
        rec2_x3 = Math.abs(coordinate_x2 + width_rec2 / 2);
        rec2_y3 = Math.abs(coordinate_y2 + height_rec2 / 2);
        rec2_x4 = Math.abs(coordinate_x2 - width_rec2 / 2);
        rec2_y4 = Math.abs(coordinate_y2 + height_rec2 / 2);
        // 创建由角坐标构成的数组
        double[] point = {rec2_x1, rec2_y1, rec2_x2, rec2_y2, rec2_x3, rec2_y3, rec2_x4, rec2_y4};

        // 遍历double类型数组
        for(int i = 0; i < 8; i++) {
            // 分别判断四个角的坐标是否在矩形内
            if(point[i] >= 0 && point[i] <= width_rec1 &&
                    point[i+1] >= 0 && point[i+1] <= height_rec1) {
                times++;
            }
            i++;
        }

        // 根据times的次数判定两个矩形的位置：包含、交集、分离
        if(times == 4) {
            System.out.println("r2 is inside r1");
        }
        if(times > 0 && times < 4) {
            System.out.println("r2 overlaps r1");
        } else if(times == 0) {
            System.out.println("r2 does not overlap r1");
        }


    }
}
