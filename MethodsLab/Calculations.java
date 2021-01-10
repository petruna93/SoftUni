package com.company.MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actions = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        Result(actions, firstNum, secondNum);
    }

    private static void Result(String actions, int firstNum, int secondNum) {
        if (actions.equals("add")) {
            AddMethod(firstNum, secondNum);
        } else if (actions.equals("multiply")) {
            MultiplyMethods(firstNum, secondNum);
        } else if (actions.equals("subtract")) {
            SubtractMethods(firstNum, secondNum);
        } else if (actions.equals("divide")) {
            DivideMethods(firstNum, secondNum);
        }
    }

    private static void DivideMethods(int firstNum, int secondNum) {
        System.out.println(firstNum/secondNum);
    }
    private static void SubtractMethods(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }
    private static void MultiplyMethods(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }
    private static void AddMethod(int firstNum, int secondNum) {
        System.out.println(firstNum+secondNum);
    }
}
