package com.company.MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        Map<Character, Integer> maps = new LinkedHashMap<>();

        for (int i = 0; i <words.length() ; i++) {
            char symbol = words.charAt(i);

            if (symbol!=' '){
                maps.putIfAbsent(symbol,0);
            } else{
                continue;
            }
            maps.put(symbol,maps.get(symbol)+1);
        }
        for (Map.Entry<Character,Integer> entry:maps.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }
    }
}
