package com.company.ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] first = new String[n];
        String[] second = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstElement= input[0];
            String secondElement= input[1];

            if (i % 2 == 0) {
                first[i] = firstElement;
                second[i] = secondElement;
            } else {
                first[i] = secondElement;
                second[i] = firstElement;
            }
        }
        System.out.println(String.join(" ",first));
        System.out.println(String.join(" ",second));

    }
}
