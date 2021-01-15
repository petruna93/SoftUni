package com.company.MapsLambdaAndStreamAPIExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> maps = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String course = tokens[0];
            String name = tokens[1];

            if (!maps.containsKey(course)) {
                maps.put(course, new ArrayList<>());
                maps.get(course).add(name);
            } else {
                maps.get(course).add(name);
            }

            input = scanner.nextLine();
        }
        maps.entrySet()
                .stream()
                .sorted((f, s) -> Integer.compare(s.getValue().size(), f.getValue().size()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));
                    entry
                            .getValue()
                            .stream()
                            .sorted((f, s) -> f.compareTo(s))
                            .forEach(s -> System.out.println(String.format("-- %s", s)));
                });
    }
}
