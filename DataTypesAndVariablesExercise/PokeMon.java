package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double NHalf = N/2.0;
        while(N >= M){
            N -= M;
            count++;
            if (N == NHalf && Y > 0){
                N /= Y;
            }
        }
        System.out.println(N);
        System.out.println(count);
    }
}
