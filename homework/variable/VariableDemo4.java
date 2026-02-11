package variable;

import java.util.Scanner;

public class VariableDemo4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的体重(kg)：");
        double weight = sc.nextDouble();
        System.out.println("请输入您的身高(m)：");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("您的BMI值为：" + bmi);

    }
}
