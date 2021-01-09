package com.company.ArraysExercise;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int [] numbers = new int[input.length];

        for (int i = 0; i <numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i <numbers.length-1 ; i++) {
            int currentNum = numbers[i];
            boolean flag = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.print(numbers[numbers.length-1]);
    }

}
