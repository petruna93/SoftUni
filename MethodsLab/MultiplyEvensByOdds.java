package com.company.MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = GetMultipleOfEvensAndOdds(n);
        System.out.println(result);

    }

    private static int GetMultipleOfEvensAndOdds(int n) {
        int evensSum = getSumOfEvenDigits(n);
        int odsSum = getSumOfOddDigits(n);

        return evensSum * odsSum;
    }

    private static int getSumOfOddDigits(int n) {
        int OddSum = 0;
        while (n>0){
            int lastNum = n%10;
            if (lastNum % 2 != 0){
                OddSum += lastNum;
            }
            n = n/10;
        }
        return OddSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int evensSum = 0;
        while (n>0){
            int lastNum = n%10;
            if (lastNum % 2 == 0){
                evensSum += lastNum;
            }
            n = n/10;

        }
        return evensSum;
    }
}

