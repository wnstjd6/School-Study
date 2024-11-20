package Deepening;
public class Q11 {
    int radius;
    String name;

    public Q11(){//파라메타 = 매개 변수
        radius = 1;
        name = "";
    }
    public Q11(int radius, String name){
        System.out.println(radius*radius*3.14);
    }
    public static void main(String[] args){
        Q11 q = new Q11(10,"호일");
    }
}