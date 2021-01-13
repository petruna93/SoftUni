package com.company.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        String operations = scanner.nextLine();
        while (!operations.equals("End")){
            String [] tokens = operations.split("\\s+");
            switch (tokens[0]){
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (index>=0 && index<numbers.size()){
                        numbers.add(index, Integer.parseInt(tokens[1]));
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(tokens[1]);
                    if (index>=0 && index<numbers.size()) {
                        numbers.remove(index);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (tokens[1].equals("left")){
                        int againActions = Integer.parseInt(tokens[2]);
                        for (int i = 0; i <againActions ; i++) {
                            int extra = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(extra);
                        }
                    }else if(tokens[1].equals("right")){
                        int againActions = Integer.parseInt(tokens[2]);
                        for (int i = 0; i <againActions ; i++) {
                            int extra = numbers.get(numbers.size()-1);
                            numbers.remove(numbers.size()-1);
                            numbers.add(0,extra);
                        }
                    }
                    break;
            }
            operations = scanner.nextLine();
        }
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");

        }
    }
}
