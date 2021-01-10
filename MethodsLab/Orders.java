package com.company.MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String products = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        Result (products,quantity);

    }

    private static void Result(String products, double quantity) {
        switch (products){
            case "coffee":
                Coffee (quantity);
                break;
            case "water":
                Water(quantity);
                break;
            case "coke":
                Coke (quantity);
                break;
            case "snacks":
                Snacks (quantity);
                break;
        }
    }

    private static void Snacks(double quantity) {
        double result = quantity*2.00;
        System.out.printf("%.2f", result);
    }

    private static void Coke(double quantity) {
        double result = quantity * 1.40;
        System.out.printf("%.2f", result);
    }

    private static void Water(double quantity) {
        double result = quantity * 1.00;
        System.out.printf("%.2f", result);
    }

    private static void Coffee(double quantity) {
        double result = quantity * 1.50;
        System.out.printf("%.2f", result);
    }
}
