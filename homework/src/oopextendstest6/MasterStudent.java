package oopextendstest6;

public class MasterStudent extends Student{
    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("硕士研究生正在攻读硕士学习内容");
    }

    @Override
    public void sleep() {
        System.out.println("硕士研究生在升级的住宿条件中睡觉");
    }
}
