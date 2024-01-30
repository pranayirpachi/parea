package Accenture;

import java.util.Scanner;

public class MaxIndexofArray {
    public static void mac(int[] arr, int num){
        int mac=-1,index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mac){
                mac=arr[i];
                index=i;
            }

        }
        System.out.println(arr[mac]);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i]= sc.nextInt();
        }
        mac(arr,num);
    }
}
