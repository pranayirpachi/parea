package Capgemini;

import java.util.Scanner;

public class Second_Largest {
    public static int secondLargest(int num,int arr[]){
        int Second_largest = -1;
        int largest = arr[0];
        for(int i=0;i<num;i++){
            if(arr[i]>largest){
                Second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>Second_largest){
               Second_largest=arr[i];
            }
        }
        return Second_largest;
    }
    public static int secondSmallest(int num,int arr[]){
        int Second_Smallest=-1;
        int smallest = arr[0];
        for(int i=0;i<num;i++){
            if(arr[i]<smallest){
                Second_Smallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<Second_Smallest){
                smallest=arr[i];
            }
        }
        return Second_Smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int [num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(secondLargest(num,arr));
        System.out.println(secondSmallest(num,arr));
    }
}
