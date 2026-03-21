package ooppolymorphic.test2;

public class Bicycle extends Vehicle{
    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    public Bicycle() {
    }
   @Override
    public void move(){
        System.out.println(getBrand()+"的交通工具正在以"+getSpeed()+"km/h的速度移动");
    }
    public void ringBell(){
        System.out.println("铃铃铃");
    }
}
