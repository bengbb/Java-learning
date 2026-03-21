package ooppolymorphic.test2;

public class Test {
    static void main() {
        Person p = new Person("xiaozhang",20,"male");
        System.out.println(p.getName() + p.getAge() + p.getGender());
        Bicycle b = new Bicycle("feige",5);
        p.drive(b);
        Car c = new Car("bingli",80);
        p.drive(c);
    }
}
