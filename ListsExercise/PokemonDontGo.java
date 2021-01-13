package com.company.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> pokemonDistance = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            pokemonDistance.add(Integer.parseInt(input[i]));
        }
        int valueOfRemovedElements = 0;
        while (!pokemonDistance.isEmpty()) {                          //5 10 6 3 5
            int command = Integer.parseInt(scanner.nextLine()); //2
            int indexToRemove = 0;

            if (command<0) {
                indexToRemove = pokemonDistance.remove(0);
                valueOfRemovedElements += indexToRemove;
                pokemonDistance.add(0, pokemonDistance.get(pokemonDistance.size() - 1));
            }else if(command>pokemonDistance.size()-1) {
                indexToRemove = pokemonDistance.remove(pokemonDistance.size() - 1);
                pokemonDistance.add(pokemonDistance.get(0));
                valueOfRemovedElements += indexToRemove;
            }else{
                indexToRemove=pokemonDistance.remove(command);
                valueOfRemovedElements+=indexToRemove;

            }
            for (int i = 0; i < pokemonDistance.size(); i++) {
                if (pokemonDistance.get(i)<=indexToRemove) {
                    pokemonDistance.set(i, pokemonDistance.get(i)+indexToRemove);
                } else {
                    pokemonDistance.set(i,pokemonDistance.get(i)-indexToRemove);
                }
            }
        }
        System.out.println(valueOfRemovedElements);
    }
}
