package org.example;

import com.github.javafaker.Faker;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ECommerceProductManagement {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        String[] categories = {"3C", "家用", "服飾", "食品", "書籍"};
        InitialProduct(productList, categories);
        lowStockProduct(productList);
        targetCaterory(productList);
        upLoadpProduct(productList, categories, 10);
        removedProduct(productList);
        householdCategory(productList);
    }

    private static void householdCategory(List<Product> productList) {
        String householdCategory = "家用";
        System.out.println("====家用=====");
        List<Product> householdCategoryList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(householdCategory)) {
                householdCategoryList.add(product);
            }
        }
        for (Product product : householdCategoryList) {
            System.out.println(product);
        }
    }

    private static void removedProduct(List<Product> productList) {
        Faker faker = new Faker();
        System.out.println("=====下架商品=====");
        if (productList.size() > 0) {
            int randomIndex = faker.random().nextInt(productList.size());
            Product rendom = productList.remove(randomIndex);
            System.out.println("已下架" + rendom);
        }
    }

    private static void upLoadpProduct(List<Product> productList, String[] categories, int eqantity) {
        Faker faker = new Faker();
        System.out.println("=====上架商品=====");
        for (int i = 0; i < eqantity; i++) {
            String id = faker.idNumber().valid();
            String name = faker.commerce().productName();
            String category = categories[faker.random().nextInt(categories.length)];
            double price = Double.parseDouble(faker.commerce().price(10, 1000));
            int stock = faker.random().nextInt(0, 100);
            Product product = new Product(id, name, category, price, stock);
            productList.add(product);
            System.out.println("已上架" + product);
        }
    }

    private static void targetCaterory(List<Product> productList) {
        String targetCaterory = "3C";
        System.out.println("====3C=====");
        List<Product> targetCateroryList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(targetCaterory)) {
                targetCateroryList.add(product);
            }
        }
        for (Product product : targetCateroryList) {
            System.out.println(product);
        }
    }

    private static void lowStockProduct(List<Product> productList) {
        System.out.println("=====庫存不足=====");
        List<Product> lowStockProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getStockQuantity() < 10) {
                lowStockProduct.add(product);
            }
        }
        for (Product product : lowStockProduct) {
            System.out.println(product);
        }
    }

    private static List<Product> InitialProduct(List<Product> productList, String[] categories) {
        Faker faker = new Faker();
        System.out.println("=====初始商品=====");
        for (int i = 0; i < 30; i++) {
            String id = faker.idNumber().valid();
            String name = faker.commerce().productName();
            String category = categories[faker.random().nextInt(categories.length)];
            double price = Double.parseDouble(faker.commerce().price(10, 1000));
            int stock = faker.random().nextInt(0, 100);
            Product product = new Product(id, name, category, price, stock);
            productList.add(product);
            System.out.println(product);
        }
        return productList;
    }

}