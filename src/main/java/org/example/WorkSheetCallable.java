package org.example;

import java.util.concurrent.Callable;

public class WorkSheetCallable implements Callable<Integer> {
    private String name;

    public WorkSheetCallable(String name) {
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum+=i;
            System.out.println("Thread - " + name + " value: " + sum);
        }
        return sum;
    }
}
