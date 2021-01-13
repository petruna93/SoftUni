package com.company.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String[] secondInput = scanner.nextLine().split("\\s+");

        List<Integer> firstList = arraysAsList(input);
        List<Integer> secondList = arraysAsList(secondInput);

        while (!(firstList.isEmpty() || secondList.isEmpty())) {
            int first = firstList.get(0);
            int second = secondList.get(0);

            if (first == second) {
                firstList.remove(0);
                secondList.remove(0);
            } else if (first > second) {
                firstList.remove(0);
                secondList.remove(0);
                firstList.add(first);
                firstList.add(second);
            }else{
                secondList.remove(0);
                firstList.remove(0);
                secondList.add(second);
                secondList.add(first);
            }
        }
        int sum = 0;
        if (!firstList.isEmpty()) {
            for (Integer integer: firstList) {
                sum += integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (Integer integer: secondList) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }

    private static List<Integer> arraysAsList(String[] input) {
        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            n.add(Integer.parseInt(input[i]));
        }
        return n;
    }
}
