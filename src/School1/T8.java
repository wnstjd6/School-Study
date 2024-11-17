package School1;
import java.util.Scanner;
class MyFriemd{
    String name;
    int age;
}
class MyFriendDeta extends MyFriemd{
    String address;
    String number;
}
public class T8 {
    public static void main(String[] args){
        MyFriendDeta m = new MyFriendDeta();
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 나이 주소 번호 입력 : ");
        String a = sc.next();
        m.name = a;
        int b = sc.nextInt();
        m.age = b;
        String c = sc.next();
        m.address = c;
        String d = sc.next();
        m.number = d;
        System.out.println("출력결과");
        System.out.println("이름 : "+a);

        System.out.println("나이 : "+b);

        System.out.println("주소 : "+c);

        System.out.println("번호 : "+d);


    }
}
