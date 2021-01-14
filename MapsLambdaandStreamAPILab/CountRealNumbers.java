package com.company.MapsLambdaandStreamAPILab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        Map<Double, Integer> numRepeated =  new TreeMap<>();

        for (int i = 0; i <input.length ; i++) {
            numRepeated.putIfAbsent(Double.parseDouble(input[i]), 0);
            numRepeated.put(Double.parseDouble(input[i]), numRepeated.get(Double.parseDouble(input[i])) + 1);
        }

        for(Map.Entry<Double,Integer>entry:numRepeated.entrySet()){
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
