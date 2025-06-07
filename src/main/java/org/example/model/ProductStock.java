package org.example.model;

public class ProductStock {
    public int quantity = 10;//庫存只有10件

    public void buyProduct(String custonerName) {
        if (quantity > 0) {
            //模擬處理時間,讓多個執行序有機會同時抵達處理
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            quantity--;
            System.out.println(custonerName + "購買一件商品成功,目前庫存為:" + quantity);
        } else {
            System.out.println(custonerName + "購買失敗,庫存不足");
        }
    }
}
