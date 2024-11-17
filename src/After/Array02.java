package After;
import java.util.Scanner;
public class Array02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;
        for(int i = 0; i<number.length; i++){
            number[i] = sc.nextInt();
            sum+=number[i];
        }
        System.out.println("합 : "+sum);
    }
}
