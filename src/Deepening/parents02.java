package Deepening;
class AAA{
    public AAA(){
        System.out.println("생성자 A");
    }
    public AAA(int x){
        System.out.println("매개변수 생성자A");
    }
}
class BBB extends AAA{
    public BBB(){
        System.out.println("생성자 B");
    }
    public BBB(int x){
        System.out.println("매개변수 생성자 B");
    }
}
public class parents02 {
    public static void main(String[] args){
        BBB b;
        b = new BBB(5);
    }
}
