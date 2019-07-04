package com.company.Lecture15;

public class Client {
    public static void main(String[] args) {

        Teacher t = new CBTeacher();
        t.study();
        t.teach();

        Students s = new CBStudent();
        s.study();
        s.play();

        Teacher ta = new CB_TA();
        ta.teach();
        ta.study();

        Students sta = new CB_TA();
        sta.play();
        sta.study();
    }
}
