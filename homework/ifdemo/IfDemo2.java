package ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    /*
     * 游戏规则说明：
     * - 初始生命值为 200；
     * - 受到 X 点伤害后，可使用技能恢复 Y 点血；
     * - X 和 Y 均由键盘输入；
     * - 假设角色不会死亡（即血量 ≥ 1）；
     * - 问题：最终角色剩余血量是多少？
     */
    static void main() {
        double health = 200;
        System.out.println("请输入受到多少伤害");
        Scanner sc = new Scanner(System.in);
        double damage = sc.nextDouble();
        System.out.println("请输入恢复多少血");
        double add = sc.nextDouble();
        health = health - damage + add;
        if(health < 1){
            System.out.println("还剩1滴血");
        }
        if(health>200){
            System.out.println("还剩200滴血");
        }
        if(health>=1 && health<=200){
            System.out.println("还剩"+health+"滴血");
        }
    }
}
