package com.xiyun.cxn.java.base.thread;

/**
 * @program javaany_
 * @description: 测试join（时间）
 * @author: cxn
 * @create: 2020/06/23 18:16
 */
public class JoinDemo1 extends Thread {


    private Thread previousThread;

    public JoinDemo1(Thread previousThread){
        this.previousThread = previousThread;
    }

    @Override
    public void run() {
        try {
            //调用上一个线程的join方法，大家可以自己演示的时候可以把这行代码注释掉
            previousThread.join(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("JoinDemo1 previousThread.join(10) ");
    }



    static class JoinTest{

        public static void main(String[] args) {
            Thread thread = Thread.currentThread();

            JoinDemo1 joinDemo1 = new JoinDemo1(thread);
            joinDemo1.start();
            try {
                Thread.sleep(14);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("main methd is over!");

        }

    }


}
