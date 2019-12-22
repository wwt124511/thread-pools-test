package com.wwt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wwt
 * @ClassName NewCachedThreadTest.java
 * @Description newCachedThreadPool 缓存线程池
 * @createTime 2019-12-22 22:47
 */
public class NewCachedThreadTest {

    public static void main(String[] args) {
        
        //创建可缓存线程池
        //线程池为无限大，当第一个
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i=0; i<10; i++) {
            final int finalI = i;
            //执行execute 表示创建了线程  类似start
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-----" + finalI);
                }
            });
        }
        executorService.shutdown();

        
    }
}
