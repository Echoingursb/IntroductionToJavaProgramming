package com.echo.practice;

public class Practice30_5_2 implements Runnable {
    public static void main(String[] args) {
        new Practice30_5_2();
    }

    public Practice30_5_2() {
        Thread t = new Thread(this);
        t.start();
        t.start();
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
