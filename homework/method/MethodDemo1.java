package method;

/*
 * 练习，定义一个方法，求两个数的和
 */

public class MethodDemo1 {
    public static int getSum(int a , int b){
        int sum = a + b;
        return sum;
    }

    static void main() {
        int a = 10;
        int b = 20;
        int sum = getSum(a,b);
        System.out.println(sum);
    }
}
