package oopextendshomework1;

public class Test {
    static void main() {
        Cook ck = new Cook(){};
        ck.number = 1928383;
        ck.name = "xiaowang";
        System.out.println(ck.number + "," + ck.name);
        ck.working();
        ck.eating();
    }
}
