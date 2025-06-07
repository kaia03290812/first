package org.example;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String sourceFile = "firstFile.txt";
        String targetFile = "firstFile copy .txt;";
        try (FileReader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("檔案讀寫發生錯誤");
        }
    }
}

