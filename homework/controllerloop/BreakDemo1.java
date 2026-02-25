package controllerloop;

import java.util.Scanner;

public class BreakDemo1 {
    static void main() {
        // 键盘录入一个大于等于2的整数，判断是否为质数
        int number;
        while (true) {
            System.out.println("请输入一个大于等于2的整数");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number >= 2)
                break;
        }
        int count = 0;
        for (int i = 2; i < number; i++) {
            if(number%i == 0){
                count++;
                break;
            }

        }
        if(count == 0)System.out.println("是质数");
        else System.out.println("不是质数");
    }
    }
