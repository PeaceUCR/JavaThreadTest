package com.multithread.test.step1;

//https://www.geeksforgeeks.org/multithreading-in-java/
public class Main {
    public static void main(String[] args) {
        System.out.println ("Thread " +
                Thread.currentThread().getId() +
                " is running");
        Thread thread1 = new ChildThreadFromThread();
        thread1.start();
        Thread thread2 = new Thread(new ThreadFromRunable());
        thread2.start();
    }
}
