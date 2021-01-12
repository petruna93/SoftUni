package com.company.ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrays = scanner.nextLine().split(" ");

        List<Integer> first = new ArrayList<>();

        for (int i = 0; i <arrays.length ; i++) {
            int num = Integer.parseInt(arrays[i]);
            if (num>= 0){
                first.add(num);
            }
        }
        if (first.size()>0){
            Collections.reverse(first);
            System.out.println(first.toString().replaceAll("[\\[\\],]", ""));

        }else{
            System.out.println("empty");
        }

    }
}
