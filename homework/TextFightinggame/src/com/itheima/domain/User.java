package com.itheima.domain;

import java.util.Random;

public class User {
    private String id;
    private String username;
    private String password;
    private boolean status;//false 禁用 true 可用

    public User() {
        //调用create ID方法生成id
        id = createID();
        status = true;
    }

    public User(String username, String password) {
        id = createID();
        this.username = username;
        this.password = password;
        status = true;
    }

    //生成随机id
    public String createID(){
        StringBuilder sb = new StringBuilder("heima");
        for (int i = 1 ; i <= 5 ; i++) {
            Random r = new Random();
            int num = r.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
