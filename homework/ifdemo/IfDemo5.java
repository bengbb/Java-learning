package ifdemo;

import java.util.Scanner;

public class IfDemo5 {
    static void main() {
/*用电量阶梯计费规则说明
 * 计费原则：采用分段计费方式，不同用电量区间对应不同的单价
 * 具体规则：
 * 1. [0 ~ 100] 度：按 0.5 元/度计费
 * 2. (100 ~ 200] 度：按 0.8 元/度计费
 * 3. (超过200] 度：按 1.2 元/度计费
 * 输入变量：
 *   - usage：表示实际用电量（double类型）
 * 输出变量：
 *   - cost：表示总电费（double类型）*/
        System.out.println("请输入用电量");
        Scanner sc = new Scanner(System.in);
        double usage = sc.nextDouble();
        double cost = 0;
        if(usage<=100)cost = 0.5*usage;
        else if(usage>100 && usage<=200)cost = 50 + (usage-100)*0.8;
        else if(usage>200)cost = 50 + 80 + (usage-200)*1.2;
        else System.out.println("输入有误");
        System.out.println("总电费为"+cost);
    }
}
