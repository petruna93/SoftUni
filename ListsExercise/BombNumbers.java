package com.company.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        String entrance = scanner.nextLine();
        String[] tokens = entrance.split("\\s+");
        int bombNumber = Integer.parseInt(tokens[0]);
        int powerBomb = Integer.parseInt(tokens[1]);

        while(numbers.contains(bombNumber)){
            int index = numbers.indexOf(bombNumber);
            int indexMinusPowerBomb = Math.max(index-powerBomb,0);
            int indexPlusPowerBomb = Math.min(numbers.indexOf(bombNumber) + powerBomb,numbers.size()-1);
            for (int i = indexPlusPowerBomb; i >= indexMinusPowerBomb; i--) {
                numbers.remove(i);
            }
        }
        int sum = 0;


        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println(sum);
    }
}
