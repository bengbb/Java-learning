package loopfor;

import java.util.Scanner;

public class ForDemo4 {
    static void main() {
        /*
描述
小诗诗开始学习数列啦。现在他想计算以下数列前 n 项的和：
S(n) = 1 - 2 + 3 - 4 + ...
示例1：
输入：4
说明：S(4) = 1 - 2 + 3 - 4 = -2
输出：-2
*/
        System.out.println("请输入要前几项的和");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            if(i%2==0)
                sum = sum - i;
            else
                sum = sum + i;
        }
        System.out.println("和为"+sum);
    }
}
