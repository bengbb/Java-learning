package ooppolymorphic.test1;

public class StudentManager {
    public void register(Person person){
        System.out.println("name:" + person.getName() + "的账号注册成功，账号" + person.getUsername() + "，密码"+person.getPassword());
        person.work();
    }
}
