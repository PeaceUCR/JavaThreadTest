package com.multithread.test.volatileTest;

public class Main {

    public static void main(String[] args){
        //add synchronized when in each for loop
        //Java, “volatile” tells the compiler that the value of a variable must never be cached as its value may change outside of the scope of the program itself.\
        //https://www.geeksforgeeks.org/volatile-keyword-in-java/
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
