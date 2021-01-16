package com.company.TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            String token = input[i];
            for (int j = 0; j < token.length(); j++) {
                System.out.print(token);
            }
        }
    }
}
