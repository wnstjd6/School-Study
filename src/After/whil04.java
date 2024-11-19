package After;
import java.util.Scanner;
public class whil04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 정수 하나 입력 : ");
        int a = sc.nextInt();
        do{
            System.out.println(a);
            a--;
        }while(a>=0);
    }
}
