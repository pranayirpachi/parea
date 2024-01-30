package Accenture;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Smllest_Largest_SUM_PROGRAM {
    public static int sumreturn(int num,int arr[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            else if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return smallest+largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumreturn(num,arr));

    }
}
