package com.itheima.ui;

import com.itheima.domain.User;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login {
    //登录注册主页面
    public void start() {
        System.out.println("游戏登录注册界面打开了");

        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到文字格斗游戏");
            System.out.println("请选择操作：1.登录 2.注册 3.退出");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> Login(list);
                case "2" -> Register(list);
                case "3" -> {
                    System.out.println("用户选择了退出操作");
                    System.exit(0);
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    public void Login(ArrayList<User> list) {
        System.out.println("用户选择了登录操作");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        if(!contains(list,username)){
            System.out.println("用户名" + username + "未注册，请先注册再登录");
            return;
        }
        int index = findIndex(list,username);
        User u = list.get(index);
        if (!u.isStatus()) {
            System.out.println("用户" + username + "已禁用");
        }
        String rightPassword = u.getPassword();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码");
            String password = sc.next();
            while (true) {
                System.out.println("请输入验证码");
                String rightcode = getCode();
                System.out.println("正确的验证码为：" + rightcode);
                String code = sc.next();
                if (rightcode.equalsIgnoreCase(code)) {
                    System.out.println("验证码输入正确");
                    break;
                } else {
                    System.out.println("验证码输入错误");
                    continue;
                }
            }
            if(rightPassword.equals(password)){
                System.out.println("登录成功");
                FightingGame fg= new FightingGame();
                fg.gameStart(username);
                break;
            }else{
                System.out.println("密码错误");
                if(i==2){
                    u.setStatus(false);
                    System.out.println("当前账号" + username + "已锁定");
                return;
                }else{
                    System.out.println("密码错误，还有" +( 2-i )+ "次机会");
                }
            }
        }





    }
    //在集合中去找username所在的索引
    public int findIndex(ArrayList<User> list , String username){
        for(int i = 0 ; i < list.size();i++){
            User u = list.get(i);
            if(u.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }
    public void Register(ArrayList<User> list) {
        System.out.println("用户选择了注册操作");
        User u = new User();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            if (!checklen(3,16,username)) {
                System.out.println("用户名的长度不符合要求，请重新输入！");
                continue;
            }//判断用户名长度
            if(!checkUsername(username)){
                System.out.println("用户名只能由字母，数字组成且不能是纯数字");
                continue;
            }//判断用户名合法性
            if(contains(list,username)){
                System.out.println("用户名重复，请重新输入");
                continue;
            }
            u.setUsername(username);
            break;


        }//校验用户名

        while (true) {
            System.out.println("请输入密码：");
            String password1 = sc.next();
            System.out.println("请再次输入密码：");
            String password2 = sc.next();
            if(!checklen(3,8,password1)){
                System.out.println("密码长度不正确，请重新输入");
                continue;
            }
            if(!checkPassword(password1)){
                System.out.println("密码只能是数字字母的组合");
                continue;
            }
            if(!password1.equals(password1)){
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }
            u.setPassword(password1);
            break;
        }//校验密码
        list.add(u);
        System.out.println("用户：" + u.getUsername() + "注册成功");
    }


    public Boolean checklen(int start, int end, String str) {
        return str.length() >= start && str.length() <= end;
    }

    //用来统计字符串中字母数字其他字符有多少个
    public int[] getCount(String userInfo){
        int charCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for(int i = 0 ; i < userInfo.length() ; i++) {
            char c =userInfo.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                charCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
            else{
                otherCount++;
            }
        }
        return new int[]{charCount,numCount,otherCount};

    }
    public Boolean checkUsername(String username){
        int arr[] = getCount(username);
        return arr[0] > 0 &&arr[1] >= 0 &&arr[2]==0;
    }

    public Boolean checkPassword(String password){
        int arr[] = getCount(password);
        return arr[0] > 0 &&arr[1] > 0 &&arr[2]==0;
    }
    public Boolean contains(ArrayList<User>list,String username){
        for(int i = 0 ; i < list.size();i++){
            User u = list.get(i);
            if(u.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    //获取验证码
    public static String getCode(){
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0 ; i < 26 ; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }//将所有大小写字母放入容器
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for(int i = 0 ; i < 4 ; i++ ){
            int index = r.nextInt(list.size());//随机获取集合中的索引
            char c = list.get(index);
            sb.append(c);
        }
        sb.append(r.nextInt(10));
        char[] arr = sb.toString().toCharArray();
        int i = r.nextInt(arr.length);
        char temp = arr[i];
        arr[i] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        String code = new String(arr);
        return code;
    }



}