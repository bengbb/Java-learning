package looploop;

public class Test2 {
    static void main() {
        //打印平行四边形
        for(int i = 1 ; i<=3;i++){
            for(int j = i ; j<=2 ; j++)
                System.out.print(" ");
            for(int j = 1; j <= 6 ; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
