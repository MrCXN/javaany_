package com.xiyun.cxn.java.base.thread;

/**
 * @program javaany_
 * @description:Thread.interrupted()
 * @author: cxn
 * @create: 2020/11/03 14:57
 */
public class InterruptedTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

//        System.out.println("myThread="+myThread.isInterrupted());
//
//        System.out.println("main="+Thread.interrupted());
//
        System.out.println("myThread1="+myThread.isInterrupted());

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
        System.out.println("myThread2="+myThread.isInterrupted());
        Thread.interrupted();
        System.out.println("myThread3="+Thread.currentThread().isInterrupted());



    }




    static class  MyThread extends Thread {

        int i=0;
        @Override
        public void run(){
            while (!this.isInterrupted()){

                System.out.println(i++);
            }
            System.out.println("is over ");
        }

    }


}
