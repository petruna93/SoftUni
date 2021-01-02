package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double result = Math.ceil(numberOfPeople / (capacity * 1.0));

        System.out.printf("%.0f", result);
    }
}
