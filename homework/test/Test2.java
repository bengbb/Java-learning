package test;

import java.util.Random;

public class Test2 {
    static void main() {
        /*
         * 红包分配问题
         * 题目描述:
         * 给你两个整数 M 和 N，M 表示红包的总额，N 表示红包的个数
         * 现在 N 个人来抽红包，每个人都是随机的，打印每个人领的红包金额
         */
        int m = 20000;
        int n = 5;
        Random r = new Random();
        for(int i = 0 ; i < 4 ; i++){
           int a = r.nextInt(1,m-n+i);
           m = m - a;
           System.out.println(a);
        }
        System.out.println(m);
         }
}
