package After;
import java.util.Scanner;
public class whil03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char num = 'a';
        do{
            System.out.println(num);
            num++;
        }while(num<='z');
    }
}
