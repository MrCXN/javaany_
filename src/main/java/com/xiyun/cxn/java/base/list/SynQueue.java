package com.xiyun.cxn.java.base.list;


import java.util.concurrent.*;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/07/08 11:16
 */
public class SynQueue {


    private static SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<Integer>(true);

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);


        for (int i = 0; i < 4; i++) {
            Future<Boolean> submit = executorService.submit(new ProductSyn(i));
        }

        for (int i = 0; i < 4; i++) {
            Future<Boolean> submit1 = executorService.submit(new ProductSyn1());
        }



        executorService.shutdown();
        boolean shutdown = executorService.isShutdown();
        System.out.println("executorService.isShutdown：" + shutdown);
        while (executorService.isShutdown()) {
            System.out.println("结束");
            if( executorService.isTerminated()){
                return;
            }
        }


    }

    static class ProductSyn implements Callable<Boolean> {

        int i;

        ProductSyn(int i) {
            this.i = i;
        }


        public Boolean call() throws Exception {
            System.out.println("synchronousQueue.put: " + i);
            synchronousQueue.put(i);
            return true;
        }
    }

    static class ProductSyn1 implements Callable<Boolean> {


        public Boolean call() throws Exception {
            Integer take = synchronousQueue.take();

            System.out.println("synchronousQueue.take: " + take);
            return true;
        }
    }


}



