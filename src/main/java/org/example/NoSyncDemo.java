package org.example;

import org.example.model.Counter;
import org.example.model.CounterThread;

public class NoSyncDemo {
    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 5;
        int incrementPerThread = 1000;
        System.out.println("No Sync Counter:");
        System.out.println("預期結果" + numberOfThreads * incrementPerThread);
        Counter sharedCount = new Counter();
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new CounterThread(sharedCount, incrementPerThread);
            threads[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
        }
        System.out.println("實際結果:" + sharedCount.count);
    }
}
