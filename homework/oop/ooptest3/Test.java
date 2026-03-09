package ooptest3;

public class Test {
    static void main() {
        Teacher t= new Teacher();
        t.name = "小张";
        t.age = 18;
        System.out.println(t.name);
        System.out.println(t.age);
        t.teach();
        t.eat();
        t.sleep();
    }
}
