package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkSheetManager {

    public void tripleThreaded () throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> a = executorService.submit(new WorkSheetCallable("A"));
        Future<Integer> b = executorService.submit(new WorkSheetCallable("B"));
        Future<Integer> c = executorService.submit(new WorkSheetCallable("C"));

        while (!(a.isDone() && b.isDone() && c.isDone())) {
        }

        System.out.println("Thread A " + a.get());
        System.out.println("Thread B " + b.get());
        System.out.println("Thread C " + c.get());

        executorService.shutdown();
    }
}
