package com.company.MethodsExercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        matrix(n);
    }
    private static void matrix(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(n + " ");
            }
            System.out.println();

        }

    }
}
