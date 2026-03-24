package oopinterface;

public class Test {
    static void main() {
        PingPangSporter pps = new PingPangSporter("xiaozhang",23);
        System.out.println(pps.getName() + "," + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
