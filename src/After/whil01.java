package After;

public class whil01 {
    public static void main(String[] args){
        int a = 0;//시
        int b = 0;//분
    while(true){
        System.out.println(a+"시"+b+"분");
        b++;

            if(a==23&&b==59||a==2&&b==30){
                System.out.println(a+"시"+b+"분");
                break;
            }
            if(b==60){
            a++;
            b=0;
        }



        }
    }
}
