package com.multithread.test.step2;

//https://www.geeksforgeeks.org/lifecycle-and-states-of-a-thread-in-java/
public class Main {
    public static void main(String[] args){
        Thread thread1 = new MyThread();
        System.out.println("State of thread after new - "+ thread1.getState());
        thread1.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread after sleep - "+ thread1.getState());


        /*can't test the wait state*/
        /*
        try {
            synchronized (thread1){
                thread1.wait(500);
                System.out.println("State of thread after wait - "+ thread1.getState());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        */


       // Thread.currentThread().notifyAll();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread after join - "+ thread1.getState());

    }
}
