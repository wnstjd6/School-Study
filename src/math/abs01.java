package math;
import java.util.Scanner;
public class abs01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){

        System.out.print("수 입력 : ");
        int a = sc.nextInt();
        if(a==0){
            break;
        }
        System.out.println(Math.abs(a));
//      abs : 절대값
        }


    }
}
