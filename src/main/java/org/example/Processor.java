package org.example;

public class Processor extends Thread{

    @Override
    public void run(){
        System.out.println("Processor - starting the thread: " + getName());
    }
}
