package com.company.MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        SignNumber(n);
    }

    private static void SignNumber(int num) {
        if (num>0){
            System.out.println(String.format("The number %d is positive.",num));
        }else if (num<0){
            System.out.println(String.format("The number %d is negative.",num));
        }else{
            System.out.println("The number 0 is zero.");
        }
    }
}
