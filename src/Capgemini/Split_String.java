package Capgemini;

import java.util.Scanner;

public class Split_String {

    public static int booleanstring(String name){
        int c =0;

        String current[] = name.split("LR");
        int n = current.length;
        for (int i = 0; i < n; i++) {
            return n++;



        }
        return 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
//        String ch[] = name.split("LR");
//
//        for(int i=0;i<ch.length;i++) {
//            System.out.println(ch.length);
//            break;
//
//        }
        booleanstring(name);


    }
}
