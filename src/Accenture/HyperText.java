package Accenture;

import java.util.Scanner;

public class HyperText {
    public static String red(String str, int n){
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                res = str.charAt(i) + res;
            }
            else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(red(str,str.length()));





    }

}
