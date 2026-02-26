package looploop;

public class Test1 {
    static void main() {
        // 打印正三角形和倒三角形
// *        *****
// **       ****
// ***      ***
// ****     **
// *****    *
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = i ; j<=5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
