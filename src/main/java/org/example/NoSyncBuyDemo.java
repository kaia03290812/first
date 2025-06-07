package org.example;

import org.example.model.Customer;
import org.example.model.ProductStock;

public class NoSyncBuyDemo {
    public static void main(String[] args)  {
        ProductStock linitedStock = new ProductStock();
        int numberOFCustoner = 15; //15個客戶同時搶購
        System.out.println("-----限量搶購活動開始-----");
        System.out.println("初始庫存:" + linitedStock.quantity);
        Thread[] customers = new Thread[numberOFCustoner];
        for (int i = 0; i < numberOFCustoner; i++) {
            customers[i]=new Customer("顧客-"+(i+1),linitedStock);
            customers[i].start();

        }
        for (int i =0; i <numberOFCustoner;i++){
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("----搶購活動結束----");
        System.out.println("最終庫存"+linitedStock.quantity);
    }
}
