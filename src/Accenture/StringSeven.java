package Accenture;

import java.util.Scanner;

public class StringSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char []arr= name.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(name.charAt(6));
            break;
        }
    }
}
