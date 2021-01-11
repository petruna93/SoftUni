package com.company.MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        long firstResult = factorial (first);
        long secondResult = factorial(second);

        double result = (double)firstResult/secondResult;

        System.out.printf("%.2f", result);
    }
    private static long factorial(int first) {
        long factorial = 1;
        for (int i = 1; i <=first ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
