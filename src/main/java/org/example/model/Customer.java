package org.example.model;

public class Customer extends Thread {
    private String name;
    private ProductStock stock;
    private SyncProductStock syncStock;

    public Customer(String name, ProductStock stock) {
        this.name = name;
        this.stock = stock;
    }

    public Customer(String name,SyncProductStock syncStock){
        this.name=name;
        this.syncStock=syncStock;
    }
    @Override
    public void run() {
        //非同步
//       stock.buyProduct(name);
        //同步
        syncStock.buyProduct(name);
    }
}
