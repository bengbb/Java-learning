package ifdemo;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args){
        /*定义一个小数表示考试成绩
        判断学生的考试成绩，如果大于等于60分输出通过，否则不通过
         */
        System.out.println("请输入考试成绩");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        if(score>=60)
            System.out.println("通过");
        else System.out.println("不通过");
    }
}
