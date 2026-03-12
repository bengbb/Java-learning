package ooptest5;

public class Student {
        /*
在校学生有属性：姓名、年龄、身高、体重。
行为：学习。
实现以下需求
要求 1：大一新生，张三，18 岁，183cm，60kg，刚进大学努力学习。
要求 2：大二期间张三体重增加了 10kg
要求 3：大三期间张三减肥成功，身高增加 2cm，体重减少 3kg
要求 4：打印大学毕业之后，张三的所有信息
         */
    private String name;
    private int age;
    private int height;
    private int weight;
    public void setName(String value){
        name = value;
    }
    public String getName(){
        return name;
    }
    public void setAge(int value){
        age = value;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(int value){
        height = value;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int value){
        weight = value;
    }
    public int getWeight(){
        return weight;
    }
    public void study(){
        System.out.println("正在学习~~~");
    }
}
