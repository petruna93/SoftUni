package com.company.BasicSyntaxConditionalStatementAndLoopsLab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age>=0 && age<=18){
            if (typeOfDay.equals("Weekday")){
                System.out.println("12$");
            }else if (typeOfDay.equals("Weekend")){
                System.out.println("15$");
            }else if (typeOfDay.equals("Holiday")){
                System.out.println("5$");
            }

        }else if (age>18 && age<=64){
            if (typeOfDay.equals("Weekday")){
                System.out.println("18$");
            }else if (typeOfDay.equals("Weekend")){
                System.out.println("20$");
            }else if (typeOfDay.equals("Holiday")){
                System.out.println("12$");
            }

        }else if (age>64 && age<=122){
            if (typeOfDay.equals("Weekday")){
                System.out.println("12$");
            }else if (typeOfDay.equals("Weekend")){
                System.out.println("15$");
            }else if (typeOfDay.equals("Holiday")){
                System.out.println("10$");
            }

        }else{
            System.out.println("Error!");
        }

    }
}
