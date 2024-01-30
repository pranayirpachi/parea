package Accenture;

import java.util.Scanner;

public class LostInForestQuestion {
    public static int string(int m){
        int cnt_final=0;
        int result = 0;

        for(int i=1;i<m+1;i++){
            int count=0;
            int n=i;
            while(n>1){
                if(n%2==0) {
                    n = n / 2;
                    count++;
                }
                else {
                    n = (3*n)+1;
                    count++;
                }
            }
            if(count>cnt_final){
                cnt_final=count;
                result=i;
            }
        }
        return result;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(string(m));

    }
}
