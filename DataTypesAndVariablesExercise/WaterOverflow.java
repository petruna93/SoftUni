package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int capacity = 255;

        for (int i = 0; i < n; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            sum += litres;

            if (capacity < sum) {
                System.out.println("Insufficient capacity!");
                sum -= litres;
            }
        }
        System.out.println(sum);
    }
}
