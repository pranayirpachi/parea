package DSA_JAVA_ALL_CODE;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class array {


    public static void main(String[] args) {
        Scanner fd = new Scanner(System.in);
        int t = fd.nextInt();
        while(t-->0){
            System.out.println("enter the number to enter");
            int n = fd.nextInt();
            Stack<Integer> stack = new Stack<>();
            stack.add(n);
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = fd.nextInt();

            }
            System.out.println(arr);

            }


        }




    }

