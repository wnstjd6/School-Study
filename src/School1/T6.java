package School1;
import java.util.Scanner;
class Book{
    String wjwk;
    String name;
    double money;
    static int u ;

    public Book(String wjwk, String name, double moeny){
        this.wjwk = wjwk;
        this.name = name;
        this.money = money;
         u = 0;
    }

    public void display(){
        System.out.println("제목 : "+wjwk+"  저자 : "+name+"   가격 : "+money);
    }

    public void apply(){
        System.out.println(money);
        money = money - money*((double)u/100.0);
    }

    public double getPri(){
        System.out.print("현재 책 가격 : ");
        return money;
    }

    public void change(int i){
        u = i;
    }


}
public class T6 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        Book b = new Book("jun","법자",38000);
        Book v = new Book("senog", "검사",68000);
        while(true){
            System.out.print("1.책 구매 || 2. 할인율 변경 || 3.종료");
            int a = sc.nextInt();
            if(a==3){
                System.out.println("시스템 종료");
            }
            switch (a){

                case 1:
                    b.apply();
                    b.display();
                    v.display();
                    break;

                case 2:
                    System.out.print("할인율 입력 : ");
                    int c = sc.nextInt();
                    b.change(c);
                    v.change(c);
                    break;
                    
                default:
                    continue;

            }

        }



    }
}
