package org.example.model;

public class MyfirstThread extends Thread {
    private String treadName;

    public MyfirstThread(String treadName) {
        this.treadName = treadName;
        System.out.println("建立執行緒" + treadName);
    }

    public void run() {
        System.out.println("執行緒" + treadName + "正在運行...");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("執行緒" + treadName + "數到" + i);
                Thread.sleep(500);//暫停五秒
            }
        } catch (InterruptedException e) {
            System.out.println("執行緒" + treadName + "被中斷");
        }
        System.out.println("執行緒"+treadName+"運行結束");
    }
}

