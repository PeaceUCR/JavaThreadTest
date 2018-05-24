package com.multithread.test.producerconsumerWithSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer extends Thread {

    final SharedResource r;
    String name;

    Semaphore sem;

    public Consumer(SharedResource r, String name, Semaphore sem){
        this.r =r;
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println(this.name+" Consumer Start");

        for(int i=0;i<100; i++){

            try {
                sem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.r.decrease(this.name);
            sem.release();
            /*
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
            }

        }
}
