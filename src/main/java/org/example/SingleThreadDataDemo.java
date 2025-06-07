package org.example;

import com.github.javafaker.Faker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SingleThreadDataDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        generatData("single-thread-users.csv", 1000);
        long endTime = System.currentTimeMillis();
        System.out.println("總共耗時" + (endTime - startTime) + "毫秒");
    }

    private static void generatData(String fileName, int numbers) {
        Faker faker = new Faker();
        try (FileWriter writer = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            bufferedWriter.write("name,email,phone");
            bufferedWriter.newLine();
            for (int i = 0; i < numbers; i++) {
                String name = faker.name().fullName();
                String email = faker.internet().emailAddress();
                String phone = faker.phoneNumber().phoneNumber();
                bufferedWriter.write(String.format("%s,%s,%s", name, email, phone));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("寫入檔案錯誤");
        }
    }
}
