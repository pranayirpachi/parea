package DSA_JAVA_ALL_CODE;

import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,51,21,23,323,2333,23};
        Arrays.sort(arr);
        int target = 323;
        int ans=binarysearch(arr,target);
        System.out.println("elements is found int index: " +ans);
    }
    static int binarysearch(int arr[],int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2; //int exceds
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                //are found
                return mid;
            }
        }
         return -1;

    }

}
