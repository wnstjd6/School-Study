package After;
import java.util.Scanner;
import java.util.StringTokenizer;

abstract class Product{
    protected int price;
    protected int quantity;
    protected String name;
    public String getName(String name){
            return name;
    }
    public abstract String display();
    public abstract String buy();
    public abstract String buy(int count);

    public Product(int price, int quantity, String name){
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
}
class Fruit extends Product{
        public Fruit(int price, int quantity, String name){
            super(price, quantity, name);
        }
        public String display(){
            return name+"에 판매되는"+name+"가"+quantity+"개 남았습니다.";
        }
        public String  buy(){
            if(quantity==0) {
                return  "해당 과일은 품절되었습니다.";
            }
                quantity--;
            return name+"과일을 "+price+"원에 "+"1개 구입하였습니다.";
        }
        public String buy(int count){
            if(quantity==0){
                return  "해당 과일은 품절되었습니다.";
            }
            else if(quantity<count){
                return "해당 과일은"+quantity+"개 남았습니다.";
            }
                quantity -= count;
                return  name+"과일을 "+price+"원에 "+count+"개 구입하였습니 다.";

        }

}
public class clas06 {
    Scanner sc = new Scanner(System.in);
    static void displayInventory( Product[] products){
        String fruitDate = "바나나 1000 5 사과 500 6 멜론 1500 2";
            StringTokenizer Date = new StringTokenizer(fruitDate);
    }
    public static void  main(String[] args){
        while(true){
            System.out.println("현재 상품 재고 : ");
        }

//        main 메서드를 갖습니다.
//                displayInventory(Product[] products) 메소드를 갖습니다.
//        모든 상품의 display() 결과를 출력
//        Scanner 클래스를 이용해 사용자 입력을 받으세요.
//        존재하지 않는 상품명 입력 시 "해당 상품이 없습니다." 출력 후 다시 입력 받습니다.
//                사용자 입력 시 발생할 수 있는 예외는 고려하지 않아도 됩니다.
//                프로그램 시작 시 미리 정의된 과일 데이터로 재고를 초기화하세요.
//        StringTokenizer를 사용하여 fruitData 문자열을 Product 객체 배열로 데이터를 생성하세요.
//                String fruitData = "바나나 1000 5 사과 500 6 멜론 1500 2";
//        Product[] products  => Product 객체 배열
//        재고가 부족하거나 없는 경우 적절한 메시지를 출력하세요.
//                프로그램은 사용자가 'exit'를 입력할 때까지 계속 실행되어야 합니다


    }
}
