package Deepening;
class Calc{
    public static int abs(int a){return a>0?a:-a;}
    public static int max(int a, int b){return a>b?a:b;}//삼항연산자 컴파일이 바로 인식한다.
    public static int min(int a, int b){return a>b?b:a;}
}
public class Access04 {
    public static void main(String[] args){
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10,8));
        System.out.println(Calc.min(-3,-8));
    }
}
