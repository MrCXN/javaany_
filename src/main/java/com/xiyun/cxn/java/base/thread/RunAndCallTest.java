package com.xiyun.cxn.java.base.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/11/05 10:43
 */
public class RunAndCallTest {

    public static void main(String[] args) {
        System.out.println("main start");
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        // Future<?> future = threadPool.submit(new MyRunnable()) ;
        Future<String> future = threadPool.submit(new MyCallable());
        //threadPool.execute();
        try {
            // 这里会发生阻塞
            System.out.println(future.get());
        } catch (Exception e) {

        } finally {
            threadPool.shutdown();
        }
        System.out.println("main end");
    }

}

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        // 模拟耗时任务
        Thread.sleep(3000);
        System.out.println("MyCallable 线程：" + Thread.currentThread().getName());
        return "MyCallable";
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        // 模拟耗时任务
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyRunnable");
    }
}

