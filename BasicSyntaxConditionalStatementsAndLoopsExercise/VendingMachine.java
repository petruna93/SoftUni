package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        double nuts = 2.0;
        double water = 0.70;
        double crisps = 1.50;
        double soda = 0.80;
        double coke = 1.0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                sum += coins;
            } else {
                System.out.println(String.format("Cannot accept %.2f", coins));
            }
            input = scanner.nextLine();
        }
        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                if (sum >= nuts) {
                    sum -= nuts;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if (sum >= water) {
                    sum -= water;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (sum >= crisps) {
                    sum -= crisps;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (sum >= soda) {
                    sum -= soda;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (sum >= coke) {
                    sum -= coke;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (!input.equals("Start")){
                System.out.println("Invalid product");
            }
            input =scanner.nextLine();
        }
        System.out.println(String.format("Change: %.2f", sum));
    }
}
