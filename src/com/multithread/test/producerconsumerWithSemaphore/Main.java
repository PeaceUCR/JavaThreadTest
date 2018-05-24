package com.multithread.test.producerconsumerWithSemaphore;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args){
        //add synchronized when in each for loop
        SharedResource r = new SharedResource();

        Semaphore sem = new Semaphore(1);
        //add sem to control the lock of set of thread
        //https://www.geeksforgeeks.org/semaphore-in-java/
        /*
        If the semaphore’s count is greater than zero, then the thread acquires a permit, which causes the semaphore’s count to be decremented.
        Otherwise, the thread will be blocked until a permit can be acquired.
        When the thread no longer needs an access to the shared resource, it releases the permit, which causes the semaphore’s count to be incremented.
        If there is another thread waiting for a permit, then that thread will acquire a permit at that time.
        */
        Thread t1 = new Producer(r, "Producer1", sem);
        Thread t2= new Consumer(r, "Consumer1", sem);
        Thread t3 = new Producer(r,"Producer2", sem);
        Thread t4= new Consumer(r, "Consumer2", sem);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
