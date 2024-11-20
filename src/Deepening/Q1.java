package Deepening;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("이름 도시 체중 독신 여부 : ");
        String a = input.next();
        String b = input.next();
        double c = input.nextDouble();
        boolean d = input.nextBoolean();
        input.close();//입력 받는거 종료
        System.out.println(a+""+b+""+c+""+d);



    }
}
