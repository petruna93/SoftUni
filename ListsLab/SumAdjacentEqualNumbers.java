package com.company.ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Double> numbers = new ArrayList<>();


        for (int i = 0; i <input.length ; i++) {
            double cur =  Double.parseDouble(input[i]);
            numbers.add(cur);
        }
        for (int i = 0; i <numbers.size()-1 ; i++) {
            double numOne = numbers.get(i);
            double numTwo = numbers.get(i+1);
            if (numOne==numTwo){
                numbers.remove(i+1);
                numbers.set(i, numOne+numTwo);
                i=-1;
            }
        }
        for(Double number :numbers){
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }
    }
}
