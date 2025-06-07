package org.example;

public class StringToIntExceptionDemo {
    public static void main(String[] args) {
        String numberStr = "1313" ;
        int number;
        try {
            number = Integer.parseInt(numberStr);
            System.out.println("轉換數字為" + number);
        } catch (ArithmeticException e) {
            System.out.println("計算錯誤");
        } catch (NumberFormatException e) {
            System.out.println("無法將字串轉為數字");
        }

    }

}
