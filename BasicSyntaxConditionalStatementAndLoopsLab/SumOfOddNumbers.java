package com.company.BasicSyntaxConditionalStatementAndLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int number = 0;
        int sum = 0;

        while(num!=counter){
            if (number%2!=0){
                System.out.println(number);
                sum+=number;
                counter++;
            }
            number++;
        }
        System.out.println(String.format("Sum: %d", sum));
    }
}
