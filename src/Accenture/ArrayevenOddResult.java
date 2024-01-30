package Accenture;

import java.util.Scanner;

public class ArrayevenOddResult {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,2,3,3,90};
        ArrayOddEven(arr1);


    }


    public static void ArrayOddEven(int arr[]){  Scanner sc = new Scanner(System.in);

        int a[] = new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                a[index]=arr[i];
                index++;

            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                a[index]=arr[i];
                index++;

            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }
    }
}
