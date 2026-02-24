package loopfor;

public class ForDemo3 {
    static void main() {
        /*有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第10项
        的数字是多少？
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...*/
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 3 ; i <=10 ; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
    }
}
