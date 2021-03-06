package com.zallerting;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        // 1970-01-01:00:00:00到当前的总秒数
        long totalSecs = System.currentTimeMillis() / 1000;
        // 当前的秒钟数
        long currSec = totalSecs % 60;
        // 剩余的分钟数
        long leftMin = totalSecs / 60;
        // 当前的分钟数
        long currMin = leftMin % 60;
        // 剩余的小时数
        long leftHr = leftMin / 60;
        // 当前的小时数, UTC时间+8为北京时间
        long currHr = leftHr % 24 + 8;
        // 获取一个输入流
        Scanner input = new Scanner(System.in);
        // 提示用户输入相对UTC的时区差
        System.out.print("Enter the offset by UTC zone: ");
        int offsetZone = input.nextInt();
        currHr += offsetZone;
        currHr %= 24;

        // 12小时计时法
        if(currHr >= 12) {
            // 将24小时制转换为12小时制
            currHr -= 12;
            System.out.println("当前时间: " + currHr + ":" + currMin + ":" + currSec + " PM" );
        } else {
            System.out.println("当前时间: " + currHr + ":" + currMin + ":" + currSec + " AM" );
        }

    }
}