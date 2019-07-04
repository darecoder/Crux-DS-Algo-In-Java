package com.company.Lecture19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human Ekta = new Human("Ekta",19);
        Human Suyash = new Human("Suyash", 20);
        Human Anu = new Human("Anu",21);

        Human[] humans = {Ekta,Suyash,Anu};
        Arrays.sort(humans);

        System.out.println(Arrays.toString(humans));
    }
}
