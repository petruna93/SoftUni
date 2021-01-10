package com.company.MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());

        double result = Result (n, pow);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double Result(double n, int pow) {
        return Math.pow(n,pow);
    }
}
