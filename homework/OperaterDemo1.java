package operater;


import java.util.Scanner;

public class OperaterDemo1 {
    /*
      需求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
     */
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        System.out.println("个位：" + ge + " 十位：" + shi + " 百位：" + bai);
    }
}
