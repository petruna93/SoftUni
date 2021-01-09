package com.company.ArraysExercise;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int [] numbers = new int[input.length];
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <numbers.length ; i++) {
            numbers [i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i <numbers.length-1 ; i++) {
            int currentNum = numbers [i];
            for (int j = i+1; j <numbers.length ; j++) {
                int secondNum = numbers[j];
                int sum = currentNum + secondNum;

                if (sum==n){
                    System.out.println(currentNum + " " + secondNum);
                }

            }

        }
    }
}
