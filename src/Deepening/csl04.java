package Deepening;

public class csl04 {
    public static void main(String[] args){
        csl04 c = new csl04();
        int i = c.getSum(1,2);
        int j = c.getSum(1,2,3);
        double k = c.getSun(1.1,2.2);
        System.out.println(i+"\n"+j+"\n"+k);
    }
    public int getSum(int i,int j) {
        return i + j;
    }
    public int getSum(int i, int j,int k){
        return i+j+k;
    }
    public double getSun(double i,double j){
        return i+j;
    }
}
