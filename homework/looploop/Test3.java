package looploop;

public class Test3 {
    //打印梯形
    static void main() {
        for(int i = 1 ; i<=3 ; i++){
            for(int j = i ; j<=2;j++)
                System.out.print(" ");
            for(int j = 1;j<=i;j++)
                System.out.print("*");
            for(int j = 1;j<=1;j++)
                System.out.print("*");
            for(int j = 1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
