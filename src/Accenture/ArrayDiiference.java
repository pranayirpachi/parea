package Accenture;

import java.util.Scanner;

public class ArrayDiiference {

    public void readarray(){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        int even_sum = 0;
        int odd_sum=0;


        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even_sum += arr[i];
            }else{
                odd_sum += arr[i];
            }


        }
        System.out.println(even_sum-odd_sum);
    }

    public static class show extends  ArrayDiiference{
        public static void main(String[] args) {
            ArrayDiiference s = new ArrayDiiference();
            s.readarray();


        }
    }


}


