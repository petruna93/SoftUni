package com.company.DataTypesAndVariablesExercise;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        int sum = number1 + number2;
        int divide = sum / number3;
        int result = divide * number4;

        System.out.println(result);
    }
}











