package Deepening;
class Circle1{
    int radi;
    public Circle1(int radi){
        this.radi = radi;
    }
    public double aera(){
        return 3.14*radi*radi;
    }
}
public class csl02 {
    public static void main(String[] args) {
        Circle1[] c = new Circle1[5];
        for (int i = 0; i<c.length; i++){
            c[i] = new Circle1(i);
            System.out.println(c[i].aera()); // 클래스 메소드를 이용해 만든 배열
        }
    }
}