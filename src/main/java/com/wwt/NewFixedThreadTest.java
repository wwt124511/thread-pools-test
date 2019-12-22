package com.wwt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wwt
 * @ClassName NewFixedThreadTest.java
 * @Description NewFixedThreadTest 创建一个定长的线程池
 * @createTime 2019-12-22 23:29
 */
public class NewFixedThreadTest {

    public static void main(String[] args) {
        //newFixedThreadPool创建线程数为3的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "-----" + finalI);
                }
            });
        }

    }
}
