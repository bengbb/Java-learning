package loopwhile;

public class WhileDemo1 {
    static void main() {
        // 需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
// 假如我有一张足够大的纸，它的厚度是0.1毫米。
// 请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
        double height = 8848860;
        double thick = 0.1;
        int times = 0;
        while(thick < height){
            thick = thick*2;
            times++;
        }
        System.out.println(times);
    }
}
