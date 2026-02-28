package array;

import java.util.Random;

public class ArrayTest3 {
    static void main() {
        /*
需求：已知数组元素为 {8,6,3,4,5,2,7,1,9,10}
要求：打乱数组中的数据

思路：
第一步：索引上的数据，跟随机位置上的数据进行交换
第二步：从第二步开始，重复上面的过程
*/
        int array[] = {8,6,3,4,5,2,7,1,9,10};
        Random r = new Random();
        int temp;
        for(int i = 0 ; i < 9 ; i++){
            int n = r.nextInt(0,9);
            temp = array[i];
            array[i] = array[n];
            array[n] = temp;
        }
        for(int i = 0 ;i<9 ; i++)
            System.out.println(array[i]);
    }
}
