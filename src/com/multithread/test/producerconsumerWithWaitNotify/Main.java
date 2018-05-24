package com.multithread.test.producerconsumerWithWaitNotify;

public class Main {

    public static void main(String[] args){

        SharedResource r = new SharedResource();
        r.setMax(10);
        r.setMin(0);

        //wait and notify can't sepcify the name
        Thread t1 = new Producer(r, "Producer1");
        Thread t2= new Consumer(r, "Consumer1");
        t1.start();
       //t2.start();
        t2.start();
       // t4.start();
    }
}
