package com.company.BasicSyntaxConditionalStatementAndLoopsLab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = 2 * i - 1;
            System.out.println(num);
            sum += num;
        }
        System.out.printf("Sum: %d", sum);

    }
}
