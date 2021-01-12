package com.company.ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers= new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {
            int current = Integer.parseInt(input[i]);
            numbers.add(current);
        }

        for (int i = 0; i <input.length/2 ; i++) {
            int numOne = numbers.get(i)+ numbers.get(numbers.size()-1);
            numbers.set(i, numOne);
            numbers.remove(numbers.size()-1);
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
