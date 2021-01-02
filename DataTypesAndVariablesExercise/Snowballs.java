package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double highSnowballValue = -1;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;


        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > highSnowballValue) {
                highSnowballValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }
        System.out.println(String.format("%d : %d = %.0f (%d)", bestSnowballSnow,bestSnowballTime,highSnowballValue,bestSnowballQuality));
    }
}
