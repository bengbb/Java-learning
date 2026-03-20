package ooppolymorphic.test1;

public class Test {
    static void main() {
        Student stu = new Student("张三","zhangsan","12345");
        StudentManager sm = new StudentManager();
        sm.register(stu);

        Teacher tea = new Teacher("里斯","lisi","12345676");
        sm.register(tea);

    }
}
