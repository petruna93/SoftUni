package com.company.TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (int i = 0; i <words.length ; i++) {
            String word = words[i];
            if (text.contains(word)){

                String repeat = repeatStr(word.length());


                text= text.replace(word,repeat);
            }
        }
        System.out.println(text);
    }

    private static String repeatStr(int length) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <length ; i++) {
            result.add("*");
        }
        return String.join("", result);
    }
}
