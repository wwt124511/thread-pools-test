package com.wwt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wwt
 * @ClassName NewSingleThreadTest.java
 * @Description 单线程池
 * @createTime 2019-12-22 23:37
 */
public class NewSingleThreadTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i <10 ; i++) {
            final int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"-----"+ finalI);
                }
            });
        }

    }
}
