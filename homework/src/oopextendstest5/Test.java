package oopextendstest5;

public class Test {
    static void main() {
        Student stu = new Student("zhangsan",23,"yinianji");
        System.out.println(stu.name + "," + stu.age + "," + stu.grade);
        Teacher tea = new Teacher("xiaozhang",30,"yuwen");
        System.out.println(tea.name +","+tea.age+","+tea.subject);
    }
}
