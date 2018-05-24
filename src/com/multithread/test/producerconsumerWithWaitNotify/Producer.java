package com.multithread.test.producerconsumerWithWaitNotify;

public class Producer extends Thread{

    SharedResource r;
    String name;

    public Producer(SharedResource r, String name){
        this.r =r;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+" Producer Start");

        for(int i=0;i<100; i++){
            this.r.increase();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            }

        }
}
