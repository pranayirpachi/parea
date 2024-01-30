package Accenture;

import java.util.Collections;
import java.util.Scanner;
/*
Accenture Coding Question are done in following form
july  26 2023
 */
public class MaximumElementsArray {
    public static void MaxElements(int num,int arr[]){

        int max = arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();

        }
        MaxElements(num,arr);

    }
}
