package array;

public class ArrayTest2 {
    static void main() {
        /*
需求：已知数组元素为 {33,5,22,44,55}
请找出数组中最大值并打印在控制台
*/
        int array[] = {33,5,22,44,55};
        int max = array[0];//不能赋值0
        for(int i = 0 ; i < 5 ; i++){
            if(max < array[i])
                max = array[i];
        }
        System.out.println(max);
    }
}
