package oopextendstest4;

public class Phone extends SmartDevice{
    @Override
    public double payment(){
        double payment = super.payment();
        payment = payment * 0.9;
        return payment;
    }
}
