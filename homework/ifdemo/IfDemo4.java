package ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    static void main() {
       /*
 * 需求：小明在每次订外卖都会在多家平台对比，看谁的优惠力度更大
 * 已知条件：
 *   - 饱了么App：全场9折优惠
 *   - 美团App：满30减10元
 * 问题
 *   - 如果价格不确定，数据由键盘录入而来谁更优惠？
        */
        System.out.println("请输入价格");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double baoprice = price*0.9;
        if(price>=30)price = price - 10;
        if(baoprice<price)System.out.println("饱了么App更划算");
        else if(baoprice>price)System.out.println("美团App更划算");
        else System.out.println("一样划算");
    }
}
