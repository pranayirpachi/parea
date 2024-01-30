package Accenture;

import java.util.Scanner;

public class ThreeValue {
    static int threevalue(int a,int b,int c){
        switch(c){
            case 1:
                return a+b;
            case 2:
                return a-b;
               // break;
            case 3:
                return a*b;
                //break;
            case 4:
                return a/b;
              //  break;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(threevalue(a,b,c));


    }
}
