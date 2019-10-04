package com.echo.practice;

public class Practice30_5_1 implements Runnable{
    public static void main(String[] args) {
        new Practice30_5_1();
    }

    public Practice30_5_1() {
        Practice30_5_1 task = new Practice30_5_1();
        new Thread(task).start();
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
