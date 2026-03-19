package oopextendstest6;

public class Student extends Person{
    private String grade;
    //空参构造
    public Student() {
    }
    //带全部参数的构造方法
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void study(){
        System.out.println("学习");
    }
}
