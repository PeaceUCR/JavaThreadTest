package com.multithread.test.volatileTest;

public class SharedResource {
    volatile int count;

    SharedResource(){
        this.count = 0;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void increase(String name){
        System.out.println(name+" Before Increase:"+ this.getCount());
        this.count++;
        System.out.println(name+" After Increase:"+ this.getCount());
    }

    public void decrease(String name){
        System.out.println(name+" Before Decrease:"+ this.getCount());
        this.count--;
        System.out.println(name+" After Decrease:"+ this.getCount());
    }
}
