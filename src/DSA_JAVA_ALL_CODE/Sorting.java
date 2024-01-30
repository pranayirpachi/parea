package DSA_JAVA_ALL_CODE;
import java.util.*;
import java.util.Arrays;

public class Sorting {

    static void swap(int arr[],int i,int j){
        int temp = arr[j];
        arr[j]=arr[j-1];
        arr[j-1]= temp;


    }

    static void bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void inseertion(int arr[]){
        for (int i = 0; i < arr.length-1 ; i++) {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void selection(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-i-1;
           // int maxidx = getmaxidx(arr,0,last);

        }
        return;
    }
//    static int getmaxidx(int arr[],int i,int j){
//        int max=i;
//        for (i = 0; i <=j ; i++) {
//            if(arr[max]<arr[i]){
//                max=i;
//                swap(arr,i,j);
//            }
//
//        }
//        return -1;
//
//
//
//    }


        public static void main (String[]args){
            int arr[] = {2, 4, 5, 6, 7};
            Sorting.bubblesort(arr);
            System.out.println("sorted bubble sorted is\n");
            System.out.println(Arrays.toString(arr));
            Sorting.inseertion(arr);
            System.out.println(Arrays.toString(arr));
            Sorting.selection(arr);
            System.out.println(Arrays.toString(arr));
        }

    }

