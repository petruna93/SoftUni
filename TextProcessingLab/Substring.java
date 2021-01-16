package com.company.TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        while(text.indexOf(word)!=-1){
            text= text.replace(word,"");
        }
        System.out.println(text);
    }
}
