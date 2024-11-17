package School1;
import java.util.Scanner;
class Carm{
    String name;
    double x;
    double y;
    public Carm(String name, double x, double y){
       this.name = name;
       this.x =  x;
       this.y =  y;
    }
    public double Yt(double v){
        System.out.println("x의 길이 : "+v);
        return v;
    }
    public double Yr(double b){
        System.out.println("y의 길이 : "+b);
        return b;
    }
    public double IO(double q){
        System.out.println("x좌표 총 이동거리 : "+(x+=q));
        return x;
    }
    public double Iu(double w){
        System.out.println("y좌표 총 이동거리 :"+(y+=w));
        return y;
    }
}
public class T3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("차 이름 입력 : ");
        String as = sc.next();

        Carm sd = new Carm(as, 0, 0);

        sd.name = as;
        while(true){
            System.out.print("차를 이동하실건가요(O/X)");
            String a = sc.next();
            if(a.equals("O")){
                System.out.print("x의 길이 : ");
                int d = sc.nextInt();
                System.out.print("y의 길이 : ");
                int e = sc.nextInt();
                System.out.println(sd.name);
              System.out.println(sd.Yt(d));
                System.out.println(sd.Yr(e));
                System.out.println(sd.IO(d));
                System.out.println(sd.Iu(e));




            }
            else if(a.equals("X")){
                System.out.println("시스템을 종료합니다.");
                //System.exit(0);
                break;
            }
            else
                System.out.println("다시 입력하시오");
            continue;
        }
    }
}
