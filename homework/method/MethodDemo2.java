package method;

import java.util.Scanner;

public class MethodDemo2 {
    /*
     * 跳水比赛评分系统
     *
     * 题目描述：
     * 跳水比赛有五个评委打分，分数在 0~100 之间。最终得分会去掉一个最高分，去掉一个最低分，
     * 剩余的分数再求平均数，改平均数为选手最终得分。
     *
     * 要求：
     * 1. 利用键盘录入 5 个整数存入数组当中，如果分数超出范围需要重新录入
     * 2. 定义方法分别求数组的最大值和最小值
     * 3. 计算五名评委的总分
     * 4. 总分 - 最大值 - 最小值，求选手最终平均分
     */
    public static int getMax(int a[]){
        int Max = 0;
        for(int i = 0 ; i < 5 ; i++)
            if(Max < a[i])
                Max = a[i];
        return Max;
    }
public static int getMin(int a[]){
    int Min = 100;
    for(int i = 0 ; i < 5 ; i++)
        if(Min > a[i])
            Min = a[i];
    return Min;
}

static void main() {
    Scanner sc = new Scanner(System.in);
       int arr[] = new int[5];
       int i = 0;
        while(i<5){
            System.out.println("请输入5个数");
            arr[i] = sc.nextInt();
            if(arr[i]<0 || arr[i] > 100){
                System.out.println("输入错误请重新输入");
                continue;
            }
            i++;
        }
        int Max = getMax(arr);
        int Min = getMin(arr);
        int sum = 0;
        for(int j = 0 ; j < 5 ; j++){
            sum = sum + arr[j];
        }
    System.out.println( (sum - Max - Min)/3);
}
}
