package oopextendstest5;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类空参");
    }

    public Person(String name,int age) {
        System.out.println("父类带参");
        this.age = age;
        this.name = name;
    }
}
