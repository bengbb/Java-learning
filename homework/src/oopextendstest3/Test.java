package oopextendstest3;

public class Test {
    static void main() {
        FirstGenerationPhone phone1 = new FirstGenerationPhone();
        phone1.call();

        SecondGenerationPhone phone2 = new SecondGenerationPhone();
        phone2.call();
        phone2.message();

        ThirdGenerationPhone phone3 = new ThirdGenerationPhone();
        phone3.call();
        phone3.gaming();
    }
}
