package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());  //7
        double headsetPrice = Double.parseDouble(scanner.nextLine()); //2
        double mousePrice = Double.parseDouble(scanner.nextLine());   //3
        double keyboardPrice = Double.parseDouble(scanner.nextLine());   //4
        double displayPrice = Double.parseDouble(scanner.nextLine());  //5

        int trashedHeadset = lostGameCount / 2;
        int trashedMouse = lostGameCount / 3;
        int trashedKeyboard = lostGameCount / 6;
        int trashedDisplay = lostGameCount / 12;

        double total = trashedHeadset * headsetPrice + trashedMouse * mousePrice +
                trashedKeyboard * keyboardPrice + trashedDisplay * displayPrice;

        System.out.println(String.format("Rage expenses: %.2f lv.", total));
    }
}
