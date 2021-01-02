package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i <num ; i++) {
            char letter = scanner.nextLine().charAt(0);
            sum += letter;
        }
        System.out.println(String.format("The sum equals: %d", sum));
    }
}
