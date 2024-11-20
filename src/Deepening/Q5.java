package Deepening;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [][] num = {{100,81},{100,100},{100,100}};
        double sum = 0;
        for(int i = 0; i<num.length; i++){
            for(int j =0; j<num[0].length; j++){
                sum+=num[i][j];
            }
        }
        System.out.println(sum/6);
    }
}