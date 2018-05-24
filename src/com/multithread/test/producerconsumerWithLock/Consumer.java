package com.multithread.test.producerconsumerWithLock;

public class Consumer extends Thread {

    final SharedResource r;
    String name;

    public Consumer(SharedResource r, String name){
        this.r =r;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+" Consumer Start");

        for(int i=0;i<5; i++){

            this.r.decrease();

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
