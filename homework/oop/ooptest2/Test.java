package ooptest2;

public class Test {
    static void main() {
        Student s1 = new Student();
        s1.name = "zhangsan";
        s1.gender = '男';
        s1.age = 18;
        s1.height = 187;
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.age);
        System.out.println(s1.height);
    }
}
