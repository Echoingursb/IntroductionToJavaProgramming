package com.echo.demo;

/**
 * 创建一个程序，它创建三个任务以及三个运行这些任务的线程
 * 1. 第一个任务打印字母a 100次
 * 2. 第二个任务打印字母b 100次
 * 3. 第三个任务打印1到100的整数
 */
public class TaskThreadDemo {
    public static void main(String[] args) {
        // 创建任务
        PrintChar printa = new PrintChar('a', 100);
        PrintChar printb = new PrintChar('b', 100);
        PrintNum print100 = new PrintNum(100);
        // 创建线程
        Thread thread1 = new Thread(printa);
        Thread thread2 = new Thread(printb);
        Thread thread3 = new Thread(print100);
        // 执行线程
        thread1.start();
        thread2.start();
        // thread3.setPriority(Thread.MAX_PRIORITY);
        thread3.start();
    }
}

// 打印指定次数一个字符的任务
class PrintChar implements Runnable {
    private char charToPrint; // 打印的字符
    private int times; // 打印的次数

    // 构造一个打印指定次数一个字符的任务
    PrintChar(char c, int t) {
        this.charToPrint = c;
        this.times = t;
    }

    // 重写run方法告诉系统执行的任务
    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint + " ");
        }
    }
}

// 打印从1到n的任务
class PrintNum implements Runnable {
    private int lastNum;

    // 构造一个打印从1到n的任务
    public PrintNum(int n) {
        this.lastNum = n;
    }

    // 告诉系统怎么执行
    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
    }
}
