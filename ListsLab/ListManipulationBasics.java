package com.company.ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        boolean flag = true;

        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            numbers.add(num);
        }
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            int arg = Integer.parseInt(commandParts[1]);


            switch (commandName) {
                case "Add":
                    numbers.add(arg);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(arg));
                    break;
                case "RemoveAt":
                    numbers.remove(arg);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    numbers.add(index, arg);
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");

        }
    }
}
