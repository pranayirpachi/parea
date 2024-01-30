package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class Negative {
    public static int[] readArray(int num,int arr[]){
      int j=0;
      int element=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0){
                element=arr[i];
        }
            if (i - j >= 0) System.arraycopy(arr, j, arr, j + 1, i - j);
            arr[j]=element;
            j++;

        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        readArray(num,arr);
    }
}
