package com.company.MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        countVowels(input);
    }

    private static void countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char vowels = input.charAt(i);

            switch (vowels) {
                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                    count++;
                    break;
            }
        }
        System.out.println(count);

    }
}
