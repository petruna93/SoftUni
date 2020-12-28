package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= num; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(row + " ");

            }
            System.out.println();
        }

    }
}
