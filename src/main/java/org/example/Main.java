package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Manager manager = new Manager();
////        System.out.println(manager.startProcessorThreads());
//        manager.startProcessorThreads();

//        WorkSheetManager workSheetManager = new WorkSheetManager();
//        workSheetManager.tripleThreaded();

        WorkSheet2 workSheet2 = new WorkSheet2();
        workSheet2.myWorkSheet();
    }
}