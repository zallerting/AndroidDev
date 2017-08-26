package com.zallerting;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args){
        // 从控制台获取键盘输入
        Scanner input = new Scanner(System.in);

        // 提醒用户输入半径的值
        System.out.print("Enter a number for radius:");
        // 对象调用自身方法读取一个double值
        double radius = input.nextDouble();

        double area = radius * radius * 3.1415;
        System.out.println("The area for the radius " + radius + " is " + area);
    }
}
