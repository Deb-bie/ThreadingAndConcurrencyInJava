package org.example;

import java.util.concurrent.CountDownLatch;

public class WorkSheetProcessor2 implements Runnable{
    private CountDownLatch latch;

    public WorkSheetProcessor2(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        int sum = 0;

        synchronized (this){
            for (int i = 1; i <= 10; i++) {
                sum+=i;
                System.out.println("My sum is now: " + sum);
            }
            latch.countDown();
        }
    }
}
