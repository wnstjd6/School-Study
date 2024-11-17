package School1;
import java.util.Scanner;
class SavingA{
    double aq;
    static double annual = 10; // 기본 이자율
    int number;
   static  int rp = 0;//초기계좌 개수

     public SavingA(double aq){
         this.aq = aq;
         this.number = rp++;

    }
    public void  calMon(double interest){//이자율 계산
         double sum = annual/12/100;
         for(int i = 0; i<interest; i++){
             aq += aq*sum;
         }
    }
    public double getBalance(double aq){//잔고확인
         this.aq = aq;
         return this.aq;
    }
    public void update(double t){//이자율 변경
         annual = t;
    }//이자울 변경

    public double dlwk(){
         System.out.println("변경된 이자율은 "+annual+"입니다.");
         return annual;
    }
}
public class T4 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    int s = 0;
     while(true){
         System.out.print("1.계좌생성 | 2.잔고확인 | 3.이자율 변경 | 4. 연간 이자율 |  5.종료 : ");
         int a = sc.nextInt();
         switch (a){
             case 1 :
                 System.out.print("계좌 초기 잔고 입력 : ");
                 double b = sc.nextInt();
                 SavingA sch = new SavingA(b);
                 System.out.print("계좌"+sch.rp+"이 생성되었습니다.\n");
                 s++;

                 case 2 :
                 if(s==0){
                     System.out.println("계좌부터 만들어 주세요");
                     continue;


                 }


            }
         }

    }
}