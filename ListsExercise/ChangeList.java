package com.company.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] entrance = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String n: entrance) {
            numbers.add(Integer.parseInt(n));
        }
        String input = scanner.nextLine();
        while (!"end".equals(input)){
            String[] num = input.split("\\s+");
            if ("Delete".equals(num[0])){
                int one = Integer.parseInt(num[1]);
                for (int i = 0; i <numbers.size() ; i++) {
                    if (numbers.get(i)==one){
                        numbers.remove(numbers.get(i));
                    }
                }
            }else if("Insert".equals(num[0])){
                int first = Integer.parseInt(num[1]);
                int index = Integer.parseInt(num[2]);
                if (index>=0 && index<numbers.size())
                    numbers.add(index,first);
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");

        }
    }
}
