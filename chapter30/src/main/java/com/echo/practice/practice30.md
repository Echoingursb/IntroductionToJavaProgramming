# 第30章 多线程和并行程序设计

## 1. 为什么需要多线程？多线程如何在一个单处理器系统中同时运行？

多线程使得程序中的多个任务可以同时执行，多线程可以使程序反应更快、交互性更强、执行效率更高。
在单处理器系统中，多个线程共享CPU时间称为时间分享，而操作系统负责调度及分配资源给它们。

## 2. 什么是可运行对象？线程是什么？

在Java中，每个任务都是Runnable接口的一个实例，也称为可运行对象(runnable object)。
线程是指一个任务从头至尾的执行流程。

## 3. 如何定义一个任务类？如何为任务创建一个线程？

定义一个实现Runnable接口的类。

通过`new Thread(任务类对象)`创建一个线程。

## 4. 如果将程序清单30-1中的14-16行的`start()`方法替换为`run()`方法，将会出现什么现象？

![](E:\SourceCode\IdeaProjects\IntroductionToJavaProgramming\chapter30\src\com\echo\practice\30.4.png)

直接调用`run()`方法只是在同一个线程中执行该方法，而没有新线程被启动。

## 5. 下面两个程序有什么错误？改正它们。

![](E:/SourceCode/IdeaProjects/IntroductionToJavaProgramming/chapter30/src/com/echo/practice/30.5.png)

`java.lang.StackOverflowError`

```java
public class Test implements Runnable{
    public static void main(String[] args) {
        new Thread(new Test()).start();
    }

    public Test() {
    
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
```

`java.lang.IllegalThreadStateException`
`test`

```java
public class Test implements Runnable {
    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
```

## 6. 下面哪些方法是`java.lang.Thread`中的实例方法？哪些方法可能抛出异常`Interrupted Exception`？哪些方法在java中是禁用的？

run, start, stop, suspend, resume, sleep, interrupt, yield, join

start, sleep, interrupt, yield, join是`java.lang.Thread`的实例方法

sleep方法会抛出`Interrupted Exception`异常

stop, suspend, resume在java中是禁用的

## 7. 如果循环中包含抛出`Interrupted Exception`异常的方法，那么为什么这个循环必须放在try-catch块中？

因为如果循环在try-catch块外，即使线程被中断，它也可能会继续执行。

## 8. 如何设置线程的优先级？线程的默认优先级是什么？

使用`java.lang.Thread`类中的`setPriority()`方法设置线程的优先级，线程的默认优先级是Thread.NORM_PRIORITY(5)

## 9. 什么导致了文本的闪烁？

程序在一个匿名内部类中创建了一个Runnable对象，这个对象启动并持续地运行以修改标签中的文本，如果标签为空白，则设置文本，如果标签具有一个文本，则设置为空白。通过设置和取消文本来模拟一个闪烁的效果。

## 10. FlashText的实例是一个可运行对象吗？

不是

## 11. 使用Platform.runLater的目的是什么？

调用`Platform.runLater(Runnable r)`告诉系统在应用程序线程中运行Runnable对象

## 12. 可以将第27-32行的代码替换为如下代码吗？

`Platform.runLater(e -> lblText.setText(text));`

不能

## 13. 如果没有应用第34行(`Thread.sleep(200)`)会发生什么？

文本不会闪烁

