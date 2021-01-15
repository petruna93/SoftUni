package com.company.MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> maps = new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            maps.putIfAbsent(name, new ArrayList<>());
            maps.get(name).add(grade);
        }

        maps.entrySet()
                .stream()
                .filter(s-> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()>=4.50)
                .sorted((s1,s2) -> {
                    double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(second,first);
                })
                .forEach(s-> System.out.printf("%s -> %.2f%n", s.getKey(),s.getValue().stream()
                        .mapToDouble(Double::doubleValue).average().getAsDouble()));
    }
}
