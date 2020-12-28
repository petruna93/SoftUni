package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;

        if (typeOfGroup.equals("Students")){
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
        }else if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }

        } else if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }
        totalPrice = price * countStudents;
        if (countStudents >=30 && typeOfGroup.equals("Students")){
            totalPrice = totalPrice * 0.85;
        }else if (countStudents>=100 && typeOfGroup.equals("Business")){
            totalPrice = (countStudents - 10) * price;
        }else if (typeOfGroup.equals("Regular") && countStudents >= 10 && countStudents<=20){
            totalPrice = totalPrice * 0.95;
        }
        System.out.println(String.format("Total price: %.2f", totalPrice));
    }
}
