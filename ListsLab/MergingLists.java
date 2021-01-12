package com.company.ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] one = scanner.nextLine().split(" ");
        String[] two = scanner.nextLine().split(" ");

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        firstList(one, first);
        firstList(two, second);

        int minIndex = Math.min(first.size(), second.size());

        for (int i = 0; i < minIndex; i++) {
            System.out.print(first.get(i) + " ");
            System.out.print(second.get(i) + " ");

        }
        if (first.size() > second.size()) {
            for (int i = minIndex; i < first.size(); i++) {
                System.out.print(first.get(i) + " ");
            }
        } else {
            for (int i = minIndex; i < second.size(); i++) {
                System.out.print(second.get(i) + " ");
            }
        }
    }

    private static void firstList(String[] one, List<Integer> first) {
        for (int i = 0; i <one.length ; i++) {
            int current = Integer.parseInt(one[i]);
            first.add(current);

        }
    }
}
