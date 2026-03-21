package ooppolymorphic.test2;

import java.sql.SQLOutput;

public class Car extends Vehicle{
    public Car(String brand, double speed) {
        super(brand, speed);
    }

    public Car() {
    }
    @Override
    public void move(){
        System.out.println(getBrand()+"的汽车正在以"+getSpeed()+"km/h的速度移动");
    }
    public void honk(){
        System.out.println("叭叭叭");
    }
}
