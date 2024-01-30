package Accenture;

import java.util.Scanner;

/*
Pyramid of card coding question are used in accenture

 */
public class Pyramid_Of_Card {
    public static  int arrayread(int num,int arr[]){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 2;
        }
        int ans =  arr[num+1];
        arr[0] = 0;
        arr[1]=2;
        for (int i = 2; i <arr.length; i++) {
            arr[i] = ((2*i) + i-1 + arr[i-1]) % 1000007;
        }
        return arr[num];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(arrayread(num,arr));

    }
}
