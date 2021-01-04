package com.company.ArraysLab;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        int[] num = new int[firstInput.length];
        String[] secondInput = scanner.nextLine().split(" ");
        int sum = 0;

        for (int i = 0; i < firstInput.length; i++) {
            if (!firstInput[i].equals(secondInput[i])) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            } else {
                num[i] = Integer.parseInt(firstInput[i]);
                sum += num[i];
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
