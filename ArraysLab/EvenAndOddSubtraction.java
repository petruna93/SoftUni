package com.company.ArraysLab;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] num = new int[input.length];
        int sumEven = 0;
        int sumOdd = 0;


        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(input[i]);

            if (num[i] % 2 == 0) {
                sumEven += num[i];
            }else{
                sumOdd += num[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
