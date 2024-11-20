package Deepening;
import java.util.Scanner;
class Q9{
    int wi;
    int heght;
    public Q9(int wi, int heght){
        this.wi = wi;
        this.heght = heght;
    }
    public int getArea(){
        return wi*heght;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 : ");
        int a = sc.nextInt();
        System.out.print("세로 : ");
        int b = sc.nextInt();
        Q9 v = new Q9(a,b);
        System.out.println("넚이 : "+v.getArea());
    }
}