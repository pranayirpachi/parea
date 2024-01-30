package DSA_JAVA_ALL_CODE;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,9,6,7,8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                //swaping process
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }


            }

        }

    }


}
