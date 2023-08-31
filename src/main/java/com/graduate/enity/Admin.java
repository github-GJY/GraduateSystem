package com.graduate.enity;

public class Admin {
    private Integer account;
    private String password;

    public Admin() {
    }

    public Admin(Integer account, String password) {
        this.account = account;
        this.password = password;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "account=" + account +
                ", password='" + password + '\'' +
                '}';
    }
}
