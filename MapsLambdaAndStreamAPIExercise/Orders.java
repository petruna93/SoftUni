package com.company.MapsLambdaAndStreamAPIExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Double>> maps = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] tokens = input.split("\\s+");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            double quantity = Double.parseDouble(tokens[2]);

            if (!maps.containsKey(product)) {
                maps.put(product, new ArrayList<>());
                maps.get(product).add(price);
                maps.get(product).add(quantity);
            } else {
                maps.get(product).set(0, price);
                double newQuantity = maps.get(product).get(1) + quantity;
                maps.get(product).set(1, newQuantity);
            }

            input = scanner.nextLine();
        }
        maps.entrySet()
                .stream()
                .forEach(o -> System.out.println(String.format("%s -> %.2f",
                        o.getKey(),o.getValue().get(0) * o.getValue().get(1) )));
    }
}
