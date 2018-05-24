package com.multithread.test.producerconsumerWithLock;

public class SharedResource {
    int count;

    SharedResource(){
        this.count = 0;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public synchronized void increase(){
        System.out.println("Before Increase:"+ this.getCount());
        this.count++;
        System.out.println("After Increase:"+ this.getCount());
    }

    public synchronized void decrease(){
        System.out.println("Before Decrease:"+ this.getCount());
        this.count--;
        System.out.println("After Decrease:"+ this.getCount());
    }
}
