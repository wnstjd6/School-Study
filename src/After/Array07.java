package After;

public class Array07 {
    public static void main(String[] args){
        int [] num = {1,4,2,5,8};
        for(int i = 0; i<num.length; i++){
            if(num[i]%2==0){
                System.out.println(num[i]+"는 짝수입니다.");
            }
            else if(num[i]%2==1){
                System.out.println(num[i]+"는 홀수입니다.");
            }
            else{
                System.out.println("뭐야");
            }
        }
    }
}
