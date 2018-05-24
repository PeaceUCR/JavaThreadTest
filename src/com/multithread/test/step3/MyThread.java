package com.multithread.test.step3;

public class MyThread extends Thread {

    //static
    // all instance share this method
    // so this method can only be access by one thread at one time
    public synchronized static void test(){
        System.out.println("test start..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test finish..");
    }

    public void run(){
        MyThread.test();
    }
}
