package org.example;

public class Manager {
    public void startProcessorThreads (){
        Processor thread = new Processor();
        thread.start();
//        thread.run();
        System.out.println("Manager - Current thread name: " + Thread.currentThread().getName());
    }
}
