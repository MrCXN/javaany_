package com.xiyun.cxn.java.base.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/11/11 15:11
 */
public class LockTest {

    public static void main(String[] args) {
//        final Business business = new Business();
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//        for (int i = 0; i < 3; i++) {
//            executor.execute(
//                    new Runnable() {
//                        public void run() {
//                            business.service();
//                        }
//                    }
//
//            );
//        }
//        executor.shutdown();


        String msg = "参数内容和扣款凭证内容不一致. 参数中appid=wxa55547a4fc01b454, 凭证内appid=wxa68f82f7226164dc";

        System.out.println("11111" + msg.indexOf("参数中appid=wxa55547a4fc01b4541"));

    }

    private static class Business {
        private int count;
        Lock lock = new ReentrantLock();
        Semaphore sp = new Semaphore(1);

        public void service() {
            //lock.lock();
            try {
                sp.acquire(); //当前线程使用count变量的时候将其锁住，不允许其他线程访问
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            try {
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(count);
            } catch (RuntimeException e) {
                e.printStackTrace();
            } finally {
                //lock.unlock();
                sp.release();  //释放锁
            }
        }
    }

}
