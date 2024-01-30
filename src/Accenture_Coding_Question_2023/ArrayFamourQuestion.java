package Accenture_Coding_Question_2023;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFamourQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int num = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        /*
        sum code of an array
         */
        int sum =0;
        for(int i=0;i<arr.length;i++){

            sum = sum+arr[i];

        }
        System.out.println(sum);
        /*
        sum of digit in array code is
         */
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[j]>0){
                    n = arr[i]%10;
                    sum = sum + n;
                   arr[j] = arr[j] % 10;

                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(sum%10-sum%10);

            }

        }





    }


}
