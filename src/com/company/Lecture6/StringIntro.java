package com.company.Lecture6;

public class StringIntro {
    public static void main(String[] args) {
        String greet = "Welcome";
        String second = "to Coding Blocks";
        String my = "naman";
        String you = "naman";
        String total = greet + 1;

//        System.out.println(my == you);       We shouldn't use this
        System.out.println(my.equals(you));
        pallindrome(my);
//        System.out.println(greet.indexOf("lc"));
        System.out.println(second.indexOf("o", 2));    //returns starting index
        System.out.println(greet.startsWith("I"));   //returns boolean
        System.out.println(greet.startsWith("c", 3));
//        String total = greet.concat(second);

        print(total);

        for (int i = 0; i < 5; i++) {
            greet = greet.concat(Integer.toString(i));
        }
        print(greet);

//        char[] chars =  greet.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

//        for (int i = 0; i < greet.length(); i++) {
//            System.out.println(greet.charAt(i));
//        }

//        System.out.println(greet);
    }

    public static void print(String line){
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    public static int pallindrome ( String line){
        for (int i = 0; i < line.length()/2 ; i++) {
            if( line.charAt(i) != line.charAt(line.length()-1-i)) {
                System.out.println("Not a Pallindrome");
                return 0;
            }
        }
        System.out.println("Pallindrome");
        return 0;
    }
}
