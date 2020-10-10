package com.xiyun.cxn.java.base.thread.pool;


import javafx.concurrent.Task;

import java.util.concurrent.*;

/**
 * @program javaany_
 * @description: ExecutorService测试
 * @author: cxn
 * @create: 2019/04/04 14:19
 */
public class ExecutorsTest1 {

    private static ExecutorService executorService ;



    public static void main(String[] args) {

        if(executorService == null){
             executorService = Executors.newFixedThreadPool(3);
        }
        CountDownLatch latch = new CountDownLatch(3);
        System.out.println("ExecutorsTest1 main is start");
        try {
        for (int i = 0 ; i < 10 ; i++){
            Future<?> submit = executorService.submit(new Runnable() {

                public void run() {
                    try {
                       // System.out.println(latch.getCount());
                        //latch.countDown();
                        TimeUnit.MILLISECONDS.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            TimeUnit.MILLISECONDS.sleep(2000);
            if(i==3 ){
                executorService.shutdown();
            }
        }

            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ExecutorsTest1 main is end");
    }

}
