import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) { // ✅ 修正 main 签名
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("请输入第 " + (i + 1) + " 个数 (1-100): ");
                int n = sc.nextInt();

                // 校验范围
                if (n < 1 || n > 100) {
                    System.out.println("数字必须在 1-100 之间！");
                    continue;
                }

                // 检查是否重复（只检查前 i 个已存入的元素）
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) { // ✅ j < i
                    if (array[j] == n) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("输入的数重复，请重新输入！");
                } else {
                    array[i] = n; // ✅ 只有不重复才存入
                    break;        // ✅ 跳出 while，进入下一个 i
                }
            }
        }

        // 输出结果
        System.out.println("最终数组:");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}