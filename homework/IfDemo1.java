package ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    /*
     * 定义一个变量表示人的体温，并判断该体温是否大于等于 38 度；
     * 若超过 38 度，则触发语音警告。
     */
    public static void main(String[] args) {
        System.out.println("请输入体温：");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp>=38){
            System.out.println("请自我隔离！");
        }
    }
}
