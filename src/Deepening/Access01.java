package Deepening;
class Sample{
    public int a;
    private int b;
    int c;
}
public class Access01 {
    public static void main(String[] args){
        Sample aClass = new Sample();
        System.out.println(aClass.a = 10);
//        aClass.b = 10; private은 같은 클래스일경우에만 사용가능
        System.out.println(aClass.c);//초기값 0
    }
}
