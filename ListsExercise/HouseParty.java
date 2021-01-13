package com.company.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> Lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] people = input.split(" ", 2);
            String name = people[0];
            String goingOrNot = people[1];

            if (goingOrNot.equals("is going!")) {
                if (Lists.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    Lists.add(name);
                }
            } else if (goingOrNot.equals("is not going!")) {
                if (Lists.contains(name)) {
                    Lists.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (int i = 0; i < Lists.size(); i++) {
            System.out.println(Lists.get(i));

        }
    }
}
