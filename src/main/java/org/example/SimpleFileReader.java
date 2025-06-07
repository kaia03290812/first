package org.example;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileReader {
    public static void main(String[] args) {
        String fileName = "firstFile.txt";
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IIOException | FileNotFoundException e) {
            System.out.println("檔案讀取錯誤");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
