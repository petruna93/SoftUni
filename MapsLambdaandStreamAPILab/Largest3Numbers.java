package com.company.MapsLambdaandStreamAPILab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> num = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt).sorted((x1,x2)->x2.compareTo(x1))
                .limit(3)
                .collect(Collectors.toList());

        for (int i = 0; i <num.size() ; i++) {
            System.out.print(num.get(i) + " ") ;
        }

    }
}
