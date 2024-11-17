package After;
import java.util.Scanner;
public class Array06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] num =  {1,4,2,5,8};
        while(true){
            System.out.print((num.length-1)+"부터 0까지 찾고싶은 수 입력  (-1 종료) : ");
            int s = sc.nextInt();
            if(s==-1){
                System.out.println("시스템 종료");
            }
            for(int i = 0; i<num.length; i++){

                if(s==num[i]){
                    System.out.println(i+"번째 인덱스자리 입니다");
                }
            }
        }
    }
}
