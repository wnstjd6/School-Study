package After;

public class Array13 {
    public static void main(String[] args){
        int [] num = {1,4,2,5,8};
        int sum =  0;
        for(int i = 0; i<num.length; i++){
            sum+=num[i];
        }
        System.out.println("평균 : "+sum/num.length);
    }
}
