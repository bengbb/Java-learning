package loopwhile;

import java.util.Scanner;

public class WhileDemo2 {
    static void main() {
        // 描述
        // 给定一个整数 n，请计算其所有数位之和。若 n 为负数，请先取其绝对值。
        System.out.println("输入一个整数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        if(number < 0)
            number = -number;
        while(number != 0){
            count = count + number%10;
            number = number/10;
        }
        System.out.println(count);
    }
}
