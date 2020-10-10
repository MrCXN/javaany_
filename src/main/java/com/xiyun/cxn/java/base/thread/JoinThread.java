package com.xiyun.cxn.java.base.thread;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/06/23 15:14
 */
public class JoinThread extends Thread{

    private static int n = 0;

    static synchronized void inc() {
        n++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                inc();
                Thread.sleep(3000);// 为了使运行速度更随机延迟三毫秒
                System.out.println(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread threads[] = new Thread[100];
        for (int i = 0; i < threads.length; i++)
            threads[i] = new JoinThread();

        for (int i = 0; i < threads.length; i++){// 运行刚才建立的一百个线程
            threads[i].start();
        }


        if (args.length > 0){
            for (int i = 0; i < threads.length; i++)
                threads[i].join();
        }
        System.out.println("n:" + n);
    }
}
