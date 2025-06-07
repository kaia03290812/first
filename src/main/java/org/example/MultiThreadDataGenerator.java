package org.example;

import org.example.model.DataGenerationTask;

public class MultiThreadDataGenerator {
   private static  final  int TOTAL_RECORDS =5000;
   private static final int THREAD_NUM=8;
   private static final int RECORDS_PER_THREAD = TOTAL_RECORDS /THREAD_NUM;

   public static void main(String[] args) {
      long startTime = System.currentTimeMillis();
      Thread[]threads =new Thread[THREAD_NUM];
      for (int i =0; i<THREAD_NUM;i++){
         String fileName ="user_multi_thread_"+i+".csv";
         DataGenerationTask task = new DataGenerationTask(fileName,RECORDS_PER_THREAD,i);
         threads[i]=new Thread(task);
         threads[i].start();
      }for (int i =0;i<THREAD_NUM;i++){
         try {
            threads[i].join();
         }catch (InterruptedException e){
            System.out.println(e);
         }
      }
      Long endTime=System.currentTimeMillis();
      System.out.println("總共耗時:"+(endTime-startTime)+"毫秒");
      System.out.println(String.format("共%s筆資料,分散在%s個檔案中",TOTAL_RECORDS,THREAD_NUM));
   }


}
