package Accenture;

import java.util.Scanner;

public class NumberApp {

    public static int CheckPassword(String str, int n){
        int capater=0,num=0;
        if(n<4){
            return 0;
        }
        if(str.charAt(0)>='0' || str.charAt(0)<='9'){
            num++;
        }
        if(str.charAt(0)>='A' && str.charAt(0)<='Z'){
            capater++;


        }
        if(num>0 && capater>0){
            return 1;
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(CheckPassword(str,str.length()));


    }
}
