package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {
    public static void main(String[] args) {
        String fileName = "firstFile.txt";
        String content = "測試java寫入";
        try {
            writSth(fileName,content);
            writSth(fileName, "第二次寫入");
            writSth(fileName, "第三次寫入");
        }catch (IOException e){
            System.out.println("寫入發生錯誤");
        }
    }


    public static void writSth(String fileName,String content)throws IOException{
        FileWriter writer = new FileWriter(fileName,true);
        writer.write(content);
        writer.write("\n");
        writer.flush();
        writer.close();
        System.out.println("成功寫入檔案"+fileName);
    }}
