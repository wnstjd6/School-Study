package After;
import java.util.Scanner;
public class Array14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {1,4,2,5,8};
       int a = sc.nextInt();
            for(int i = 0; i<num.length; i++){
                if(a==num[i]){
                    System.out.println(a+"의에 인덱스 값은 : "+i);
                    break;
                }
                else{
                    System.out.println("없는 값입니다."+(-1));
                }

            }

    }
}
