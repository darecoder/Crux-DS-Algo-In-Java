package com.company.Lecture6;

public class SubstringIntro {
    public static void main(String[] args) {
        String greet = "Hello";
//        System.out.println(greet.substring(5, 5));    Gives Empty String

       subStrings(greet);
    }

    public static void subStrings(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i; j < line.length() ; j++) {
                System.out.println(line.substring(i,j+1));
            }
        }
    }
}
