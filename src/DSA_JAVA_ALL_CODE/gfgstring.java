package DSA_JAVA_ALL_CODE;

import java.util.Scanner;

public class gfgstring {



    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter the search elemnt ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                System.out.println(arr[i-1]);
            }
            else{
                System.out.println(-1);
            }

        }

    }
}
