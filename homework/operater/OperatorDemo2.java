package operator;

import java.util.Scanner;

public class OperatorDemo2 {
    /*
     * 给定秒数 seconds，将其转换为对应的小时数、分钟数和秒数，
     * 使得总时间不变，但分钟数和秒数都不超过 59。
     */
    static void main() {
        System.out.println("请输入秒数：");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds2 = (seconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds2);

    }
}
