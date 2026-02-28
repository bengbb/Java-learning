package array;

import java.util.Scanner;

public class ArrayTest1 {
    static void main() {
        /*
需求：已知数组元素为 {33,5,22,44,55,33}
键盘录入任意一个数据，查找这个数据在数组中是否存在
如果数组中要查找的数据出现多次，只要显示第一次的索引即可

输出要求：
  如果存在打印索引
  如果不存在，提示："该数据不存在"
*/
        int array[] ={33, 5, 22, 44, 55, 33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        int flag = 0;
        int i;
        for(i = 0 ; i < 6 ; i++){
            if(number == array[i]){
                System.out.println(i);
                flag = 1;
                break;
                }

        }
        if(flag == 0)System.out.println("不存在");

    }
}
