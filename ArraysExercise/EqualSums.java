package com.company.ArraysExercise;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        boolean flag = false;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            for (int j = 0; j <i ; j++) {
                leftSum+= numbers[j];
            }
            int rightSum = 0;
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }
            if (leftSum == rightSum) {
                flag = true;
                index = i;
                break;
            }

        }
        if (flag) {
            System.out.println(index);
        }else{
            System.out.println("no");
        }
    }
}
