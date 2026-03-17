package oopextendstest3;

public class ThirdGenerationPhone extends SecondGenerationPhone{
    @Override
    public void call() {
        System.out.println("开启视频");
        System.out.println("用手机打电话");
    }
    public void gaming(){
        System.out.println("玩游戏");
    }
}

