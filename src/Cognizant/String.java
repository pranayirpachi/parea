package Cognizant;

import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.lang.String name = sc.next();
        StringBuffer stringBuffer = new StringBuffer(name);

        stringBuffer.reverse();
        if(stringBuffer.reverse().equals(name)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
