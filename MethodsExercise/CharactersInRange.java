package com.company.MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first<second) {
            rangeCharacters(first, second);
        }else{
            rangeCharacters(second,first);
        }
    }

    private static void rangeCharacters(char first, char second) {
        for (int i = first+1; i <second ; i++) {
            System.out.printf("%c ",i);
        }
    }
}
