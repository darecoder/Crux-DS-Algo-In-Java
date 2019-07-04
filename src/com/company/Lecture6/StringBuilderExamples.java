package com.company.Lecture6;

public class StringBuilderExamples {
    public static void main(String[] args) {

        String line = "EktaMishra";

        System.out.println(toggle(line));

//        StringBuilder h = new StringBuilder("Hello");
//
//        System.out.println(h);
//        for (int i = 0; i < 10000; i++) {
//            h .append("a");
//        }
    }

    public static String toggle (String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length() ; i++) {
            int ch = line.charAt(i);
            if( ch >= 'a' && ch <= 'z'){
//                ch = ch - 32;
                ch = (ch - 'a') + 'A';
            }
            else if( ch >= 'A' && ch <= 'Z'){
//                ch = ch + 32;
                ch = (ch - 'A') + 'a';
            }
            builder.append((char)ch);
        }
        return builder.toString();
    }
}
