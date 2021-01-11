package com.company.MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            checking(input);
            input = scanner.nextLine();
        }
    }

    private static void checking(String input) {
        String reverseInput = new StringBuffer(input).reverse().toString();
        if (input.equals(reverseInput)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
