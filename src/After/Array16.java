package After;

public class Array16 {
    public static void main(String[] args){
        int [] num = {1,4,2,5,8};
        int cou = 0;
        int ut = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i]%2==0){
                cou++;
            }
            else {
                ut++;
            }

        }
        System.out.println("짝수 개수 : "+cou);
        System.out.println("홀수 개수 : "+ut);
    }
}
