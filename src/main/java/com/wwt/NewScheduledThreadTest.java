package com.wwt;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author wwt
 * @ClassName NewScheduledThreadTest.java 定时任务线程池
 * @Description TODO
 * @createTime 2019-12-22 23:33
 */
public class NewScheduledThreadTest {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是三秒钟后执行。。。。");
            }
        }, 3, TimeUnit.SECONDS);

    }
}
