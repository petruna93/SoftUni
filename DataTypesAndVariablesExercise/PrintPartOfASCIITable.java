package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num; i <= num2; i++) {
            int letter = i;
            System.out.print(String.format("%c ", letter));
        }
    }
}
