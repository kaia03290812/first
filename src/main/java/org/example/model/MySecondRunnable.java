package org.example.model;

public class MySecondRunnable implements Runnable {
    private String taskName;

    public MySecondRunnable(String taskName) {
        this.taskName = taskName;
        System.out.println("建立任務" +taskName);
    }

    public void run() {
        System.out.println("任務" + taskName + "正在運行...");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("任務" + taskName + "完成步驟" + i);
                Thread.sleep(700);//暫停0.7秒
            }
        } catch (InterruptedException e) {
            System.out.println("任務" + taskName + "被中斷");
        }
        System.out.println("任務" + taskName + "運行結束");
    }
}
