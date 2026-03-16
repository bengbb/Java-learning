package oopextendstest2;

public class Test {
    static void main() {
        Android a = new Android();
        a.brand = "魅族";
        a.price = 1999;
        System.out.println(a.brand + "," + a.price);
        a.nfc();
        a.call();
        a.message();
    }
}
