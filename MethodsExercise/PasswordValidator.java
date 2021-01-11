package com.company.MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine().toLowerCase();
        boolean characters = true;
        boolean letterAndDigit = true;
        boolean leastTwoDigits = true;


        boolean resultOne = characters(password, characters);
        boolean resultTwo = letterAndDigit(password, letterAndDigit);
        boolean resultTree = leastTwoDigits(password, leastTwoDigits);

        if (resultOne && resultTwo && resultTree) {
            System.out.println("Password is valid");
        }


    }

    private static boolean leastTwoDigits(String password, boolean leastTwoDigits) {
        int count = 0;
        while (count < 2) {
            for (int i = 0; i < password.length(); i++) {
                char a = password.charAt(i);
                if (a >= 48 && a <= 57) {
                    count++;
                }
            }

            if (count < 2) {
                System.out.println("Password must have at least 2 digits");
                leastTwoDigits = false;
                break;
            }
        }
        return leastTwoDigits;
    }

    private static boolean letterAndDigit(String password, boolean letterAndDigit) {
        for (int i = 0; i < password.length(); i++) {
            char A = password.charAt(i);
            if (!(A >= 48 && A <= 57) && !(A >= 97 && A <= 122)) {
                System.out.println("Password must consist only of letters and digits");
                letterAndDigit = false;
                break;
            }

        }
        return letterAndDigit;
    }


    private static boolean characters(String password, boolean characters) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            count++;
        }
        if (6 > count || count > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            characters = false;
        } else {
            characters = true;
        }
        return characters;
    }
}
