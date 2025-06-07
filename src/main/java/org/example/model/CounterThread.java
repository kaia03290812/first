package org.example.model;

public class CounterThread extends Thread {
    private Counter counter;
    private int incrementPerThread;

    public CounterThread(Counter counter, int incrementPerThread) {
        this.counter = counter;
        this.incrementPerThread = incrementPerThread;
    }

    public void run() {
        for (int i = 0; i < incrementPerThread; i++) {
            counter.increment();//每個thread都會對counter進行遞增
        }
    }
}
