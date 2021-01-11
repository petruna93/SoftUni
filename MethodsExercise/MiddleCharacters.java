package com.company.MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        middleChar(input);
    }

    private static void middleChar(String input) {
        if (input.length() % 2 == 0) {
            for (int i = (input.length() / 2) - 1; i <= input.length() / 2; i++) {
                char a = input.charAt(i);
                System.out.print(String.format("%c", a));
            }
        } else {
            for (int i = input.length() / 2; i <= input.length() / 2; i++) {
                char a = input.charAt(i);
                System.out.print(String.format("%c", a));
            }
        }
    }
}
