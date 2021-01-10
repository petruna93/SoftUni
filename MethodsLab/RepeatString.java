package com.company.MethodsLab;

import java.util.Scanner;

public class RepeatString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String text = scanner.nextLine();
            int n = Integer.parseInt(scanner.nextLine());

            Result(text, n);
        }

        private static void Result(String text, int n) {
            for (int i = 0; i < n; i++) {
                System.out.print(text);
            }
        }
    }

