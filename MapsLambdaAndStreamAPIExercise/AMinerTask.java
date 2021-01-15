package com.company.MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> maps = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")){
            String resource = input;
            Integer quantity = Integer.parseInt(scanner.nextLine());

            maps.putIfAbsent(resource,0);
            maps.put(resource,maps.get(resource)+quantity);

            input = scanner.nextLine();
        }
        for (Map.Entry<String,Integer>entry:maps.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
