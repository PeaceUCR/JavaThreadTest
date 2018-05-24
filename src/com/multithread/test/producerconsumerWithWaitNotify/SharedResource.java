package com.multithread.test.producerconsumerWithWaitNotify;

public class SharedResource {
    int count;
    int max;
    int min;
    SharedResource(){
        this.count = 0;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setCount(int count) {
        this.count = count;

    }

    public int getCount() {
        return count;
    }
//wait must use in srynchronized block
// check condition use while not if
//https://stackoverflow.com/questions/33186280/why-we-must-use-while-for-checking-race-condition-not-if
    public synchronized void increase() {
        while(this.getCount()>=max){
            System.out.println("Reach Max-wait");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Before Increase:"+ this.getCount());
        this.count++;
        System.out.println("After Increase:"+ this.getCount());
        notify();
    }

    public synchronized void decrease() {
        while(this.getCount()<=min){
            System.out.println("Reach Min-wait");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Before Decrease:"+ this.getCount());
        this.count--;
        System.out.println("After Decrease:"+ this.getCount());
        notify();
    }
}
