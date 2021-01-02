package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int leaving = 0;
        int countDay = 0;

        while (startingYield >= 100) {
            leaving = leaving + (startingYield - 26);
            startingYield -= 10;
            countDay ++;
        }
        if (leaving>26) {
            leaving = leaving - 26;
        }else{
            leaving=leaving;
        }
        System.out.println(countDay);
        System.out.println(leaving);
    }
}
