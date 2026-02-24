package loopfor;

import java.util.Scanner;

public class ForDemo2 {
    static void main() {
        /*
需求：键盘录入两个数字，表示一个范围。
统计这个范围中。
既能被3整除，又能被5整除数字有多少个？
*/
        System.out.println("请输入两个数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = a ; i <= b ; i++){
            if(i%3==0&&i%5==0)
                sum++;
        }
        System.out.println(sum);
    }
}
