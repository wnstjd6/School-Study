package Deepening;
import java.util.*;

public class csl03 {

    public static void main(String[] args){
        char a[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};

        printl(a);
        printCharArray(a);
        printl(a);


    }
    static void printCharArray(char c[]){
        for(int i =0; i<c.length; i++){
            if(c[i]==' '){
                c[i]=',';
            }
        }
    }

    static void printl(char q[]){
        for(int i = 0; i<q.length; i++){
            System.out.print(q[i]);
        }
        System.out.println(" ");
    }
}


