package oopextendstest6;

public class MajorTeacher extends Teacher{
    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public MajorTeacher() {
    }

    @Override
    public void teach() {
        System.out.println("专业课老师正在教授专业课内容");
    }
}
