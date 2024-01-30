package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class Latest_Question {
    public static void read(int n,int min,int max,int last){
        int total_range = n*last;
        if(min*n<=total_range && max*n>=total_range){
            if(total_range%2==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();
        int last = sc.nextInt();
        read(n,min,max,last);

    }
}
