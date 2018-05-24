package com.multithread.test.step2;

public class MyThread extends Thread {

    public void run(){
        System.out.println("State of thread after run - "+ this.getState());

        try {
            //sleep is a static method that affects the current thread:
            Thread.sleep(1000);

            //this will not be execute until sleep finish
            //System.out.println("State of thread after sleep - "+ this.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
