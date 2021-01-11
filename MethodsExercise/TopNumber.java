package com.company.MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        isNumberTop(n);
    }
    private static void isNumberTop(int n) {
        for (int i = 1; i <=n ; i++) {
            int num = i;
            int count = 0;
            int sum = 0;
            while (num > 0) {
                int lastName = num % 10;
                sum += lastName;
                if (lastName % 2 != 0) {
                    count++;
                }
                num = num / 10;
            }
            if (sum%8 ==0 && count>=1){
                System.out.println(i);
            }

        }
    }
}
