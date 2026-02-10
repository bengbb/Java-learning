package variable;

public class VariableDemo2 {
    static void main() {
        /*
我方：叉子          对方：长手
攻击：220          攻击：210
防御：85           防御：80
血量：1012.5       血量：1223.3
技能加成：1.2      技能加成：1.3

技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
普通造成伤害的公式：攻击力 - 对方防御力

计算：
我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
*/

        int attack1 = 220;
        int attack2 = 210;
        int defense1 = 85;
        int defense2 = 80;
        double health1 = 1012.5;
        double health2 = 1223.3;
        double skillAddition1 = 1.2;
        double skillAddition2 = 1.3;
        double damage1 = attack1 - defense2;
        double damage2 = attack1 * skillAddition1 - defense2;
        health2 = health2 - damage1;
        System.out.println("我方第一次进行普通攻击，造成" + damage1 + "伤害，对方还剩余" + health2 + "血量");
        health2 = health2 - damage2;
        System.out.println("我方第二次进行技能攻击，造成" + damage2 + "伤害，对方还剩余" + health2 + "血量");
    }
}
