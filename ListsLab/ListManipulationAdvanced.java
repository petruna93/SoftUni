package com.company.ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();


        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            numbers.add(num);
        }
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];


            switch (commandName) {
                case "Contains":
                    int arg = Integer.parseInt(commandParts[1]);
                    if (numbers.contains(arg)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandParts[1].equals("even")) {
                        for (int i = 0; i < input.length; i++) {
                            int n = Integer.parseInt(input[i]);
                            if (n % 2 == 0) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandParts[1].equals("odd")) {
                        for (int i = 0; i < input.length; i++) {
                            int n = Integer.parseInt(input[i]);
                            if (n % 2 != 0) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < input.length; i++) {
                        int n = Integer.parseInt(input[i]);
                        sum += n;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int third = Integer.parseInt(commandParts[2]);
                    if (commandParts[1].equals(">")) {
                        for (int i = 0; i < input.length; i++) {
                            int n = Integer.parseInt(input[i]);
                            if (n > third) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandParts[1].equals("<")) {
                        for (int i = 0; i < input.length; i++) {
                            int n = Integer.parseInt(input[i]);
                            if (n < third) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();

                    } else if (commandParts[1].equals(">=")) {
                        for (int i = 0; i < input.length; i++) {
                            int n = Integer.parseInt(input[i]);
                            if (n >= third) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandParts[1].equals("<=")) {
                        for (int i = 0; i < input.length; i++) {
                            int n = Integer.parseInt(input[i]);
                            if (n <= third) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                        break;
                    }
            }
            command = scanner.nextLine();
        }

    }
}
