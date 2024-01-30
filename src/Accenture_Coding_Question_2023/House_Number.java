package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class House_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n*(3*n+1)/2;
        System.out.println(ans);
    }
}
