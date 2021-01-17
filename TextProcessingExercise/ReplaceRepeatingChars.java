package com.company.TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Character> chars = new ArrayList<>();

        for (int i = 1; i <input.length() ; i++) {
            char previousSymbol = input.charAt(i-1);
            char symbol = input.charAt(i);

            if (i==1){
                chars.add(previousSymbol);
            }

            if (previousSymbol==symbol) {
                continue;
            }else {
                chars.add(symbol);
            }
        }
        for (int i = 0; i <chars.size() ; i++) {
            System.out.print(chars.get(i));
        }
    }
}
