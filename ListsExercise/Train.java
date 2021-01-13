package com.company.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> wagons = new ArrayList<>();

        for (String n:input) {
            wagons.add(Integer.parseInt(n));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String entrance = scanner.nextLine();

        while (!entrance.equals("end")){
            String[] enter = entrance.split(" ");
            if (enter[0].equals("Add")){
                wagons.add(Integer.parseInt(enter[1]));
            }else {
                for (int i = 0; i <wagons.size(); i++) {
                    int sum = (Integer.parseInt(enter[0])) + wagons.get(i);
                    if (sum>maxCapacity){
                        continue;
                    }else {
                        wagons.set(i,sum);
                        break;
                    }
                }
            }
            entrance = scanner.nextLine();
        }
        for (int i = 0; i <wagons.size() ; i++) {
            System.out.print(wagons.get(i) + " ");
        }
    }
}
