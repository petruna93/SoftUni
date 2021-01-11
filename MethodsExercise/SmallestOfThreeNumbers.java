package com.company.MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        smallestNumber(n1, n2, n3);
    }

    private static void smallestNumber(int num1, int num2, int num3) {
        int smallNum = num1;
        if (num2 < num1) {
            smallNum = num2;
            if (num3 < num2) {
                smallNum = num3;
            }
        }
        System.out.println(smallNum);
    }
}
