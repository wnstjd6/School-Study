package Deepening;
class Person02{

}
class Student extends Person02{

}
class Researcher extends Person02{

}
class Professor extends Researcher{

}
public class parents05 {
    static void print(Person02 p){
        if(p instanceof Person02)
            System.out.println("Person");
        if(p instanceof Student)
            System.out.println("Student");
        if(p instanceof  Researcher)
            System.out.println("Researcher");
        if(p instanceof Professor)
            System.out.println("Professor");
        System.out.println();
    }

    public static void main(String[] args){
        System.out.print("new Student()->\t"); print(new Student());
        System.out.print("new Researcher() ->\t"); print(new Researcher());
        System.out.print("new Professor() -> \t"); print(new Professor());
    }
}
