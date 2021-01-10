package com.company.MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String one = scanner.nextLine();
        String second = scanner.nextLine();

        Result(type, one, second);
        ;

    }

    private static void Result(String type, String one, String second) {

        if (type.equals("int")) {
            TypeInt(one, second);
        } else if (type.equals("char")) {
            TypeChar(one, second);
        } else if (type.equals("string")) {
            TypeString(one, second);
        }
    }

    private static void TypeString(String one, String second) {
        if (one.compareTo(second) >= 0) {
            System.out.println(one);
        } else {
            System.out.println(second);
        }
    }

    private static void TypeChar(String one, String second) {
        char firstChar = one.charAt(0);
        char secondChar = second.charAt(0);
        if (firstChar > secondChar) {
            System.out.println(firstChar);
        } else {
            System.out.println(secondChar);
        }
    }

    private static void TypeInt(String one, String second) {
        int firstNum = Integer.parseInt(one);
        int secondNum = Integer.parseInt(second);
        if (firstNum > secondNum) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }
    }
}
