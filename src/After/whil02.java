package After;
import java.util.Scanner;
public class whil02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int HP  = 100;
        int at = 10;
        int rh = 0;

        do{
            System.out.println("몬스터를 공격하시겠습니까?");
            String s = sc.next();
            if(s.equals("y")){
                rh++;
                HP-=at;
            }
            else if (s.equals("n")) {
                System.out.println("시스템 종료");
            }
            else{
                continue;
            }
        }while(HP!=0);
        System.out.println("공격횟수 : "+rh);
    }
}
