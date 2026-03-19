package oopextendstest5;

public class Student extends Person{
    String grade;
    public Student(){
        System.out.println("student空参构造");
    }
    public Student(String name,int age,String grade){
        System.out.println("student带参构造");
        super(name,age);
        this.grade = grade;
    }
}
