package com.itheima.ui;

import com.itheima.domain.HeroCharacter;

import java.util.Scanner;

public class FightingGame {
    public void gameStart(String username){
        System.out.println("欢迎来到文字格斗游戏");
       HeroCharacter player = createPlayerCharacter(username);
        System.out.println("角色创建成功！");
        System.out.println("初始属性为："+player.show());
        System.out.println("拥有的技能："+player.showSkill());
    }
    public HeroCharacter createPlayerCharacter(String username) {
        System.out.println("创建您的角色：");
        System.out.println("您的角色名为：" + username);
        int points = 20;
        System.out.println("请分配属性点（20点）：");
        System.out.println("1.生命值（每点+10HP）");
        System.out.println("2.攻击力（每点+2ATK）");
        System.out.println("3.防御力（每点+10EF）");
        Scanner sc = new Scanner(System.in);
        String[] attributes = {"生命值","攻击力","防御力"};
        int[] values = new int[3];
        for (int i = 0; i < attributes.length; i++) {
            System.out.println("分配点数到" + attributes[i] + "(剩余点数：" + points + "):");
            int input = sc.nextInt();
            if(input < 0) {
                System.out.println("无效输入！默认分配0点");
                input = 0;
            }
                if(input > points){
                    System.out.println("属性点不足！剩余属性点全部分配到：" + attributes[i]);
                    input = points;
                }
                points = points - input;
                values[i] = input;
        }
        HeroCharacter player = new HeroCharacter(
                username,
                100+values[0]*10,
                10 + values[1]*2,
                0+values[2]*1
        );
        player.skillList.add("普通攻击");
        player.skillList.add("强力一击");
        player.skillList.add("生命汲取");
        return player;
    }
}
