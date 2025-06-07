package org.example;

import org.example.model.MyfirstThread;

public class ThreeadDemo {
    public static void main(String[] args) {
        MyfirstThread thread1 =new MyfirstThread("A");
        MyfirstThread thread2 =new MyfirstThread("b");
        //啟動執行緒必須呼叫start()並非run
        thread1.start();
        thread2.start();
        System.out.println("主執行緒運行結束");
    }
}
