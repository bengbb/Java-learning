package ooptest4;

public class Dog {
    private String name;
    private int age;
    public void setName(String value){
        name = value;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        if(num >= 0 && num <= 15){
            age = num;
        }
        else{
            System.out.println("当前的年龄不符合");
        }
    }
    public int getAge(){
        return age;
    }
}
