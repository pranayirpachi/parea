package Accenture;

import java.util.Scanner;

public class BinaryOperation {
   public static int operation(String str){
        if(str==null){
            return -1;
        }
        int res  = (char) (str.charAt(0)-'0');
        for(int i=1;i<str.length();){
            char prev = str.charAt('i');
            if(prev=='A'){
                res = (char) (res & (str.charAt(i)-'0'));
                i++;


            }
            else if(prev=='B'){
                res = (char) (res | (str.charAt(i)-'0'));

            }
            else{
                res = (char) (res ^ (str.charAt(i)-'0'));
                i++;
            }

        }
       return res;


    }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.next();

        System.out.println(operation(str));


    }
}
