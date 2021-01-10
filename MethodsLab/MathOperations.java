package com.company.MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int n2 = Integer.parseInt(scanner.nextLine());

        double finalResult = result (n1,operator, n2);
        System.out.println(new DecimalFormat("0.####").format(finalResult));

    }

    private static double result(int n1, String operator, int n2) {
        double result = 0.0;
        if (operator.equals("*")){
            result = multiply(n1,n2);
        }else if(operator.equals("+")){
            result = Adds(n1,n2);
        }else if(operator.equals("-")){
            result = Substraction(n1,n2);
        }else if(operator.equals("/")){
            result = Delenie(n1,n2);
        }
        return result;
    }

    private static double Delenie(int n1, int n2) {
        return n1/(n2*1.0);
    }

    private static int Substraction(int n1, int n2) {
        return n1-n2;
    }

    private static int Adds(int n1, int n2) {
        return  n1+n2;
    }

    private static int multiply(int n1, int n2) {
        return n1*n2;
    }
}
