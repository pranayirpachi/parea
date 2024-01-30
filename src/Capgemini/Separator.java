package Capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Separator{


    public static boolean name(String s){
        for(int i=0;i<s.length();i++){
           if(s.toUpperCase(Locale.ROOT).equals(s.charAt(i))){
               return true;
           }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        name(name);
    }

}