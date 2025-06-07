package org.example;

public class PasswordValidation {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("請輸入密碼");
        if (scanner.hasNext()) {
            String pwd = scanner.next().trim();
            if (pwd.length() > 20 || pwd.length() < 8) {
                throw new LengthException();
            }
            String regex = "(.*[a-z].*)" + "(.*[A-Z].*)";
            if (!pwd.matches(regex)) {
                throw new RuntimeException("密碼格式驗證不符");
            }
            System.out.println("最終顯示為" + pwd);
        }
    }
}
