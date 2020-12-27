package com.company.BasicSyntaxConditionalStatementAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        if (m<=10) {
            for (int i = m; i <= 10; i++) {
                int result = n * i;
                System.out.println(String.format("%d X %d = %d", n, i, result));
            }
        }else {
            int result = n * m;
            System.out.println(String.format("%d X %d = %d", n, m, result));

        }
    }
}
