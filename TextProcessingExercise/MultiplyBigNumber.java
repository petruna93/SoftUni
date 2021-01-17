package com.company.TextProcessingExercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine().replaceFirst("^0+","");
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (secondNum == 0) {
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for (int i = firstNum.length() - 1; i >= 0; i--) {
            int num = Integer.parseInt(String.valueOf(firstNum.charAt(i)));
            int sumLastDigit = carry + secondNum * num;

            if (i == 0) {
                sb.insert(0, sumLastDigit);
            } else {
                int lastDigit = sumLastDigit%10;
                carry = sumLastDigit/10;
                sb.insert(0,lastDigit);
            }
        }
        System.out.println(sb);
    }
}
