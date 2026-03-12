package ooptest5;

public class Test {
   public static void main(String[] args) {
        Student s = new Student();
       s.setName("张三");
       s.setAge(18);
       s.setHeight(183);
       s.setWeight(60);
       System.out.println("大一新生"+s.getName()+s.getAge()+"岁"+s.getHeight()+"cm"+s.getWeight()+"kg");
       s.study();

       int newweight = s.getWeight() + 10;
       s.setWeight(newweight);
       int newage = s.getAge() + 1;
       s.setAge(newage);
       System.out.println("大二体重变成了"+ s.getWeight()+"kg");

       int newheight = s.getHeight() + 2;
       s.setHeight(newheight);
       newweight = s.getWeight() - 3;
       s.setWeight(newweight);
       newage = s.getAge() + 1;
       s.setAge(newage);
       System.out.println("大三身高变成" + s.getHeight()+"cm"+"体重变成了" + s.getWeight() + "kg");

       newage = s.getAge() + 1;
       s.setAge(newage);
       System.out.println("毕业时"+s.getName()+s.getAge()+"岁"+s.getWeight()+"kg"+s.getHeight()+"cm");
    }
}
