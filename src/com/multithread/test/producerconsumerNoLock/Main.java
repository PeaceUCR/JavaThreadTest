package com.multithread.test.producerconsumerNoLock;

public class Main {

    public static void main(String[] args){
        //add synchronized when in each for loop
        SharedResource r = new SharedResource();
        Thread t1 = new Producer(r, "Producer1");
        Thread t2= new Consumer(r, "Consumer1");
        Thread t3 = new Producer(r,"Producer2");
        Thread t4= new Consumer(r, "Consumer2");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
