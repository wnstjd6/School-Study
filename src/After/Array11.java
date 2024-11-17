package After;
import java.util.Scanner;
public class Array11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int[5];
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            System.out.print(i+"번째 요소의 값 : ");
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
