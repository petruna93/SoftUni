package com.company.TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        boolean flag = true;

        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            if (word.length() < 3 || word.length() > 16) {
                continue;
            }
            for (int j = 0; j < word.length(); j++) {
                char symbol = word.charAt(j);
                if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                    flag = false;
                    break;
                }else{
                    flag=true;
                }
            }
            if (flag) {
                System.out.println(word);
            }
        }
    }
}
