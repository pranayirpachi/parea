package Accenture;
import java.util.*;

public class AbsoluteDAIFFERENCE {
    public static int findcount(int arr[],int length,int num,int diff){
        int count =0;
        if(arr==null){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=num){
                int difference = Math.abs(num-arr[i]);

                if(difference<=diff){
                    count++;
                }

            }

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        int num  = sc.nextInt();
        int diff = sc.nextInt();
        System.out.println(findcount(arr, arr.length, num,diff));

    }
}
