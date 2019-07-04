package com.company.Lecture23;

public class ThreadExample extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("printing" + i);
        }
    }
}
