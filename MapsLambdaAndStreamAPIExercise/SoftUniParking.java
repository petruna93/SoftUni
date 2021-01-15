package com.company.MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> maps = new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String name = tokens[1];


            switch (command) {
                case "register":
                    String licenseNum = tokens[2];
                    if (!maps.containsKey(name)) {
                        maps.put(name, licenseNum);
                        System.out.printf("%s registered %s successfully%n", name, licenseNum);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", licenseNum);
                    }
                    break;
                case "unregister":
                    if (!maps.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        maps.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;
            }
        }
        for (Map.Entry<String,String>entry: maps.entrySet()){
            System.out.printf("%s => %s%n", entry.getKey(),entry.getValue());
        }
    }
}
