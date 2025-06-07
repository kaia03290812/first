package org.example;

import com.github.javafaker.Faker;

import java.util.*;

class ActivityRegistration {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Map<String, String> registeredUser = new HashMap<>();
        System.out.println("=====活動報名=====");
        int numberOfAttempts = 20;
        int successfulRegistration = 0;

        for (int i = 0; i < numberOfAttempts; i++) {
            String uniqueId = faker.internet().uuid();
            String useName = faker.funnyName().name();
            System.out.println("嘗試報名" + useName);
            registeredUser.put(uniqueId, useName);
        }
        System.out.println("----報名結束----");
        System.out.println("嘗試報名人數" + numberOfAttempts);
        System.out.println("成功報名人數" + registeredUser.size());

        System.out.println("----報名成功列表----");
        if (registeredUser.isEmpty()) {
            System.out.println("沒有人成功報名");
        } else {
            System.out.println(registeredUser);
//
            for (String key : registeredUser.keySet()) {
                System.out.println(key + ":" + registeredUser.get(key));
            }
        }
//        for (Map.Entry<String, String> key:registeredUser.entrySet()){
//            System.out.println(key.getKey()+":"+key.getValue());
//        }

}}