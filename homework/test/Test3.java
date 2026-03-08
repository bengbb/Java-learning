package test;

public class Test3 {
    static void main() {
/*
 * 给定两个正序数组 arr1 和 arr2，请先合并数组，并找出合并之后数组的中位数。
 * 举例：
 *     1 2 3 4 5 6 7 8 9        中位数：5
 *     1 2 3 4 5 6              中位数：(3 + 4) / 2
 */
        int []arr1 = {1,3,5,7,9};
        int []arr2 = {2,4,6,8};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int []arr3 = new int[len1 + len2];
        int a = 0 ; int b = 0;int i = 0;
        while(a<len1 && b<len2){
            arr3[i++] = arr1[a] <= arr2[b] ? arr1[a++]:arr2[b++];
        }
        if(len1 < len2)
            for(;i<len1 + len2;i++){
                arr3[i] = arr2[b++];
            }
        else if(len1 > len2)
            for(;i<len1 + len2;i++){
                arr3[i] = arr1[a++];
            }
            for(int k = 0 ; k < len1 + len2 ; k++)
                System.out.println(arr3[k]);
         }
}
