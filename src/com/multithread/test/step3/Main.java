package com.multithread.test.step3;

public class Main {
    //test for synchronized key word
    //https://blog.csdn.net/xiao__gui/article/details/8188833

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread();
            thread.start();
        }
    }
}

