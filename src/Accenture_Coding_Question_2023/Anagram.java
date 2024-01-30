package Accenture_Coding_Question_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static String arangram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2)? "yes" : "no";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(arangram(str1,str2));

    }
}

