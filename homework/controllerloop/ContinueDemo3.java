package controllerloop;

import java.util.Scanner;

public class ContinueDemo3 {
    static void main() {
        // 描述
// 牛牛在酒桌上玩一个小游戏，第一个人从1开始数数，如果遇到数字中含有数字4或者是4的倍数，
// 则跳过这个数字报下一个，谁数错了就要罚酒一杯。
// 牛牛为了作弊，它想将所有符合规则的数字预先生成出来。请你帮助牛牛列出1到n之间所有既不包含数字4
// 又不是4的倍数的整数，按升序输出。
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            if(i%4 == 0){
                System.out.println("过");
                continue;
            }
            int num = i;
            boolean hasfour = false;
            while(num!=0){
                if(num%10 == 4){
                    hasfour = true;
                    break;
                }
                num = num/10;
            }
            if (hasfour) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}
