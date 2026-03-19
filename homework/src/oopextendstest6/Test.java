package oopextendstest6;

public class Test {
    static void main() {
        BachelorStudent bs = new BachelorStudent("xiaoshi", 18, "dayi");
        System.out.println(bs.getName() + "," + bs.getAge() + "," + bs.getGrade());
        bs.eat();
        bs.sleep();
        bs.study();
    }
}
