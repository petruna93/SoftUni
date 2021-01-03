package com.company.DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countChar = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countChar; i++) {
            char a = scanner.nextLine().charAt(0);
            int next = a + n;
            System.out.printf("%c", next);
        }
    }
}
