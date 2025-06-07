package org.example;

import org.example.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String fileName = "user.csv";
        int gmailCount = 0;
        int hotmailCount = 0;
        int yahooCount = 0;
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            if ((line = bufferedReader.readLine()) != null) ;
            {
                System.out.println("標題為:" + line);
            }
            while ((line = bufferedReader.readLine()) != null) {
                String[] date = line.split(",");
                User user = new User(date[0], date[1], date[2]);
                user.setEmailProvider(date[1]);
                System.out.println(user);
                switch (user.getEmailProvider()){
                    case "gmail.com":gmailCount++;
                    break;
                    case "yahoo.com":yahooCount++;
                    break;
                    case "hotmail.com":hotmailCount++;
                    break;
                }
            }
            System.out.printf("gmail為:%s,yahoo為:%s,hotmaill為:%s",gmailCount,yahooCount,hotmailCount);
        } catch (IOException exception) {
            System.out.println("檔案讀取有誤" + exception.getMessage());
        }
    }
}