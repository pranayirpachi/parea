package Capgemini;

import java.util.Scanner;
/*
most importance question are used in a coding interview
 */
public class StringHash {
    public static void main(String[] args) {
        String name  = "";
        Scanner sc = new Scanner(System.in);
        String na = sc.next();
        for (int i = 0; i <na.length() ; i++) {
            if(na.charAt(i)=='#'){
                name = na.charAt(i)+name;
            }
            else {
                name = name + na.charAt(i);
            }
        }
        System.out.println(name);
    }
}
