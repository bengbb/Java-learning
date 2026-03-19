package oopextendstest6;

public class GeneralTeacher extends  Teacher{
    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public GeneralTeacher() {
    }

    @Override
    public void teach() {
        System.out.println("通识课老师正在教授通识课内容");
    }
}
