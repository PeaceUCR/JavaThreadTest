package com.multithread.test.producerconsumerWithSemaphore;

import java.util.concurrent.Semaphore;

public class Producer extends Thread{

    SharedResource r;
    String name;
    Semaphore sem;

    public Producer(SharedResource r, String name, Semaphore sem){
        this.r =r;
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println(this.name+" Producer Start");

        for(int i=0;i<100; i++){
            try {
                sem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.r.increase(this.name);
            sem.release();
            /*
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
            }

        }
}
