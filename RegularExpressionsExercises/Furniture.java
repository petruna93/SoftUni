package com.company.RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\>\\>(?<furniture>[A-Za-z]+)\\<\\<(?<price>[0-9.]+)!(?<quantity>[0-9]+)";

        Pattern pattern = Pattern.compile(regex);
        String text = scanner.nextLine();
        double sum = 0;
        System.out.println("Bought furniture:");

        while(!text.equals("Purchase")){
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                System.out.println(matcher.group("furniture"));
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double total = price*quantity;
                sum += total;
            }
            text = scanner.nextLine();
        }
        System.out.println(String.format("Total money spend: %.2f", sum));
    }
}
