package com.company.MapsLambdaandStreamAPILab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<String,Integer> odd = new LinkedHashMap<>();

        for (int i = 0; i <input.length ; i++) {
            String word = input[i].toLowerCase();
            odd.putIfAbsent(word,0);
            odd.put(word,odd.get(word)+1);
        }
        List<String> something = new ArrayList<>();
        for (Map.Entry<String,Integer>entry:odd.entrySet()) {
            if (entry.getValue()%2!=0){
                something.add(entry.getKey());
            }
        }
        for (int i = 0; i <something.size() ; i++) {
            if (i<something.size()-1){
                System.out.print(something.get(i) + ", ");
            }else{
                System.out.print(something.get(i));
            }

        }
    }
}
