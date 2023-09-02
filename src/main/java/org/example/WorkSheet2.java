package org.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkSheet2  {
    public void myWorkSheet () throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(3);


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new WorkSheetProcessor2(latch));
        executorService.submit(new WorkSheetProcessor2(latch));
        executorService.submit(new WorkSheetProcessor2(latch));

        latch.await();

        System.out.println(Thread.currentThread().getName() + " has finished");



    }


}
