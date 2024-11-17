package After;

public class Array12 {
    public static void main(String[] args){
        int [] a = {1,4,2,5,8};
        int max = 0;
        for(int i = 0; i<a.length; i++){
            if(max<a[i])max=a[i];
        }
        System.out.println("제일 큰값 : "+max);

        int min = max;
        for(int i = 0; i<a.length; i++){
            if(min>a[i])min=a[i];
        }
        System.out.println("제일 작은 값 : "+min);
        for(int i = 0; i<a.length; i++){
            if(max==a[i]){
                System.out.println("최대값 인덱스 번호 :"+i);
            }
             if(min==a[i]){
                System.out.println("최소값 인덱스 번호 : "+i);
            }
        }

    }
}
