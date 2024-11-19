package Deepening;
class Person01{
    String name;
    String id;
    public Person01(String name){
        this.name = name;
    }
}
class Student1 extends Person01{
    String grade;
    String department;
    public Student1(String name){
        super(name);
    }
}
public class parents04 {
    public static void main(String[] args){
//        Person01 p;
//        Student1 s = new Student1("육준성");
//        p=s;
//        System.out.println(p.name);
//
//        s = (Student1)p;

        Person01 p1 = new Student1("육");
        Student1  s1 = (Student1)p1;
        System.out.println(s1.name);
        s1.grade = "A";

    }
}
