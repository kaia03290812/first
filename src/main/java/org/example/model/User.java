package org.example.model;

public class User {
    private String name;
    private String email;
    private String phone;
    private  String EmailProvider;

    public String getEmailProvider() {
        return EmailProvider;
    }

    public void setEmailProvider(String emailProvider) {
        EmailProvider = emailProvider.split("@")[1];

    }

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return
                "電話=" + phone + ", email=" + email +
                ", 名字=" + name
                ;
    }
}
