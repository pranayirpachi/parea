package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class ArrayReverse {
    public static void read(String name){
        int count  =0 ;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)>=0 && name.charAt(i)<=9){
                if(name.charAt(i)==1){
                    count++;
                }
                else if(name.charAt(i)==2){
                    count++;
                }
                else if(name.charAt(i)==3){
                    count++;
                }
                else if(name.charAt(i)==4){
                    count++;
                }

            }
            System.out.println(count);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String current_name = sc.next();
        read(name);


    }
}
