package After;

public class Array03 {
    public static void main(String[] args){
        int [] num = {1,4,2,5,8};
        int Max = 0;
        for(int i = 0; i<num.length; i++){
            if(Max<num[i])Max=num[i];
        }
        System.out.println("최대값 : "+Max);
    }
}
