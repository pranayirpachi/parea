package Capgemini;

import java.util.Scanner;

public class MaXIndexPratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0,index=0;
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<num;i++){
            if(arr[0]>=max){
                max=arr[i];
                i=index;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
