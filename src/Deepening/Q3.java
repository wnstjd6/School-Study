package Deepening;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] b = new int[5];
        double an = 0.0;
        int sum = 0;
        System.out.print("5개의 정수 입력 : ");
        for(int i = 0; i<b.length; i++){
            int a = sc.nextInt();
            sum+=a;
            b[i] = a;
            an = (double)sum/(b.length);
        }
        System.out.println("평균 : "+an);
    }
}
