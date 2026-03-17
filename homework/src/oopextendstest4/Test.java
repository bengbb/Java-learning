package oopextendstest4;

public class Test {
    static void main() {
        Phone p = new Phone();
        p.name = "小米";
        p.price = 4999;
        double payment = p.payment();
        System.out.println(payment);
    }
}
