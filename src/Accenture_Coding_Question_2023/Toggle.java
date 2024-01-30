package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class Toggle {
    public static void read(int num,String arr[]){
        System.out.println(Math.sqrt(num));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String arr[] = new String[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.next();
        }
        read(num,arr);

    }
}
