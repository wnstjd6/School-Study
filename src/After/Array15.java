package After;

public class Array15 {
    public static void main(String[] args){
        int [] a = {3,2,2,3,1,5,1};
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]==a[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
