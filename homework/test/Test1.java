package test;

public class Test1 {
/*
 * 移除数组中指定值的元素
 *
 * 题目描述:
 * 给你一个数组 nums 和一个值 val，你需要删除所有数值等于 val 的元素
 * 示例 :
 * 输入：nums = [3,2,2,3], val = 3
 */
static void main() {
    int []arr = {0,1,2,3,0,4,2};
    int val = 2;
    int slow = 0 ;//慢指针，用来指向被替换的位置
    for(int fast = 0 ; fast < arr.length ; fast++){
        if(arr[fast] != val){
            arr[slow++] = arr[fast];
        }
        }
    for(int i = 0 ; i < slow ; i++){
        System.out.println(arr[i]);
    }
}
 }
