package ooppolymorphic.test1;

public class Teacher extends Person{
    public Teacher(String name, String username, String password) {
        super(name, username, password);
    }

    public Teacher() {
    }

    @Override
    public void work() {
        System.out.println("老师教书");
    }
}
