package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int padawansCnt = Integer.parseInt(scanner.nextLine());
        double pricePerLightsaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double lightsabersTotalPrice = Math.ceil(padawansCnt * 1.10) * pricePerLightsaber;
        double robesTotalPrice = padawansCnt * pricePerRobe;
        int freeBelts = padawansCnt / 6;
        double beltTotalPrice = (padawansCnt - freeBelts) * pricePerBelt;

        double finalSum = lightsabersTotalPrice + robesTotalPrice + beltTotalPrice;

        if (finalSum > budget) {
            double moneyNeed = finalSum - budget;
            System.out.println(String.format("Ivan Cho will need %.2flv more.", moneyNeed));
        } else {
            System.out.println(String.format("The money is enough - it would cost %.2flv.", finalSum));
        }
    }
}
