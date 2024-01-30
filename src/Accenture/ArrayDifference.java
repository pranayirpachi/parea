package Accenture;

import java.util.Scanner;

public class ArrayDifference {
    static int countArray(int arr[],int length,int num,int diff){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(Math.abs(num-arr[i])<=diff){
                c++;
            }
        }
        return c>0?c:-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int diff = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countArray(arr,arr.length,num,diff));


    }
}
