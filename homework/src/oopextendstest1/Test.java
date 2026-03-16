package oopextendstest1;

public class Test {
    static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        s.name = "小a";
        s.age = 19;
        s.grade = "高三";
        System.out.println(s.name + "," + s.age + "," + s.grade);
        s.study();s.eat();
    }
}
