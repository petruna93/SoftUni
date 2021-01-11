package com.company.MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());


        int result = addMethods(one,two);
        subtractMethods (result, three);

    }

    private static void subtractMethods(int result, int three) {
        System.out.println(result - three);
    }

    private static int addMethods(int one, int two) {
        int sum = one + two;
        return sum;
    }
}
