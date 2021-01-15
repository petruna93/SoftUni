package com.company.MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> maps = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String id = tokens[1];

            maps.putIfAbsent(company, new ArrayList<>());
            if (!maps.get(company).contains(id)) {
                maps.get(company).add(id);
            }


            input = scanner.nextLine();
        }
        maps.entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s", entry.getKey()));
                    entry
                            .getValue()
                            .stream()
                            .forEach(s -> System.out.println(String.format("-- %s", s)));

                });
    }
}
