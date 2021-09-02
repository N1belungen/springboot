package com.n1belungen.entity;

//后台管理员表

public class Admin {
    private String user_name;
    private String user_pwd;

    public Admin(String user_name, String user_pwd) {
        this.user_name = user_name;
        this.user_pwd = user_pwd;
    }

    public Admin() {
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                '}';
    }
}
