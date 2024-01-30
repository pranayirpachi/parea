package Accenture;

import java.util.Scanner;

public class SumNumBerDifference {
    static int difference(int m,int n){
        int s1=0,s2=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                s1 = s1 + i;

            }
            else{
                s2 = s2 + i;
            }
        }
        return Math.abs(s1-s2);
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(difference(m,n));


    }
}
