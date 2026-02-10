package variable;

public class VariableDemo1 {
    static void main() {
        /*微信余额0元
        支付宝余额10元
        银行卡余额20元
        问：现在一共有多少钱？
        微信收了十元红包，又发出去两元，还有几元？
         */
        double a = 0;
        double b = 10;
        double c = 20;
        System.out.println(a + b + c);
        a = a + 10 - 2;
        System.out.println(a);
    }
}
