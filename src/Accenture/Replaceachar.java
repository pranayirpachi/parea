package Accenture;

import java.util.Scanner;

public class Replaceachar {
    static void read(String name,char ch1,char ch2){
        String extra = "";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==ch1){
                extra = extra + ch2;
            }
            else if(name.charAt(i)==ch2){
                extra = extra + ch1;
            }
            else{
                extra = extra + name.charAt(i);
            }
        }
        System.out.println(extra);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        read(name,ch1 ,ch2);

    }
}
