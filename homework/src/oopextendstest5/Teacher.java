package oopextendstest5;

public class Teacher extends Person{
    String subject;

    public Teacher(String name, int age, String subject) {
        System.out.println("子类teacher的带参构造");
        super(name, age);
        this.subject = subject;
    }

    public Teacher() {//空参构造
        System.out.println("子类teacher的空参构造");
    }
}
