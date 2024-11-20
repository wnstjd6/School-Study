package Deepening;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
        int max = 0;
    System.out.println("양수 5개를 입력하시오.");
    for(int i = 0; i<a.length; i++){
        int b = sc.nextInt();
        a[i] = b;
        if(a[i]>max)max=a[i];
    }
   int min = max;
    for(int i = 0; i<a.length; i++){
      if(min>a[i])min=a[i];
    }
    System.out.println("제일 큰 수 : "+max+"제일 작은 수 : "+min);

    }
}
