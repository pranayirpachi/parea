package Accenture;

import java.util.Scanner;

public class RemainderModuler {
   public static int length(String str){
        int rem=0;
        for(int i=0;i<str.length();i++){
            int num = rem*10 + (str.charAt(i)-'0');
            rem = num%11;
        }
        return rem;

    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String str = sc.next();
        System.out.println(length(String.valueOf(Integer.parseInt(str))));
    }
}
