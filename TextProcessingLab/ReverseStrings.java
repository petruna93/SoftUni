package com.company.TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            System.out.print(input + " = ");

            for (int i = input.length() - 1; i >= 0; i--) {
                char symbol = input.charAt(i);
                System.out.print(symbol);
            }
            System.out.println();
            input = scanner.nextLine();
        }
    }
}

