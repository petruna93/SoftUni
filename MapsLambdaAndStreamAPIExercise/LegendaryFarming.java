package com.company.MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        Map<String,Integer> item = new LinkedHashMap<>();
        Map<String,Integer> junk = new TreeMap<>();

        item.put("shards",0);
        item.put("fragments",0);
        item.put("motes",0);


        while (flag){
            String[] tokens = scanner.nextLine().split(" ");
            for (int i = 0; i <tokens.length ; i+=2) {
                int quantity = Integer.parseInt(tokens[i]);
                String materials = tokens[i+1].toLowerCase();

                if (materials.equals("shards")|| materials.equals("fragments")|| materials.equals("motes")){
                    item.put(materials,item.get(materials)+quantity);

                    if (item.get(materials)>=250){
                        item.put(materials,item.get(materials)-250);
                        switch (materials){
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;

                        }
                        flag=false;
                        break;
                    }

                }else{
                    junk.putIfAbsent(materials,0);
                    junk.put(materials,junk.get(materials)+quantity);
                }


            }
        }
        item.entrySet()
                .stream()
                .sorted((f,s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result==0){
                        result = f.getKey().compareTo(s.getKey());
                    }
                    return result;
                }).forEach(e-> System.out.println(e.getKey()+ ": " + e.getValue()));

        junk.forEach((k,v) -> System.out.println(k + ": " + v));

    }
}
