package com.company.MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int result = Result (a,b);
        System.out.println(result);
    }

    private static int Result(int a, int b) {
        return a*b;

    }
}
