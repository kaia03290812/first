package org.example;

import com.github.javafaker.Faker;

public class ExceptionDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();


        for (int i = 0; i < 10; i++) {
            int numerator = 10;
            int denominator = faker.random().nextInt(2);
            int result;
            System.out.println("分母為" + denominator);
            try {
                result = divide(numerator, denominator);
            } catch (ArithmeticException e) {
                result = 0;
            }
//      System.out.println("除數不得為零");
            System.out.println("計算結果" + result);
        }
        System.out.println("繼續執行");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw e;
        }
        return result;
    }
}
