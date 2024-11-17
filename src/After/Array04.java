package After;
import java.util.Scanner;
public class Array04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] num = new int[5];
        int Max = 0;
        int Min = 0;
        for(int i = 0; i<num.length; i++){
            System.out.print("정수 입력 : ");
            num[i] = sc.nextInt();
            if(Max<num[i])Max=num[i];
        }
        Min = Max;
        for(int i = 0; i<num.length; i++){
            if(Min>num[i])Min=num[i];
        }
        System.out.println("최대값 : "+Max+"최소값 : "+Min);
    }
}
