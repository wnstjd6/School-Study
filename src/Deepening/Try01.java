package Deepening;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Try01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수3개를 입력 : ");
        int n = 0, sum = 0;
            for(int i = 0; i<3; i++){
                System.out.print(i+">>");

                try {
                    n = sc.nextInt();
                    sum+=n;
                }
                catch (InputMismatchException e){
                    System.out.println("정수를 입력하세요");
                    sc.nextLine();//엔터를 눌어 아까 누른 문자열이나 그런값을 엔터로 값 초기화
                    i--;

                }
            }
            System.out.println("합은  : "+ sum);
    }
}
