package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(name);

       if(stringBuilder.reverse().equals(name)){
           System.out.println(1);
       }
       else{
           System.out.println(0);
       }
        //System.out.println(stringBuilder);
//        String ans = Integer.toString(Integer.parseInt(name));
//        StringBuilder stringBuilder = new StringBuilder(ans);


    }
}
