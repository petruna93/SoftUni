package com.company.BasicSyntaxConditionalStatementAndLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int newMinutes = minutes + 30;
        if (newMinutes>=60){
            hours+=1;
            newMinutes-=60;
        }if (hours>23){
            hours-=24;
        }
        System.out.printf("%d:%02d", hours, newMinutes);;

    }
}
