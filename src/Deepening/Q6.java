package Deepening;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] a = new int [4][];
        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[2];
        int b = sc.nextInt();
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                a[i][j] = b;
                b++;
            }
            b = 10*(i+2);
        }
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
    }
}
