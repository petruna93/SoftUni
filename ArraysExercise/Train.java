package com.company.ArraysExercise;

import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] countWagons = new int[n];
        int sum = 0;

        for (int i = 0; i <countWagons.length ; i++) {
            countWagons[i]= Integer.parseInt(scanner.nextLine());
            sum += countWagons[i];
            System.out.print(countWagons[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
