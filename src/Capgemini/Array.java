package Capgemini;


import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[num];
        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){


            System.out.print("" +arr[i] +" ");
        }
        Arrays.sort(arr);
        for (int i=k;i< arr.length;i++){
            //if(k>=arr[i]){
                System.out.println(arr[i]);
            //}
        }


    }
}
