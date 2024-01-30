package DSA_JAVA_ALL_CODE;

//import static javax.swing.text.html.parser.Element.getMaxIndex;

import java.sql.Time;
import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int selection(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            //find and max items
            int last= arr.length-i-1;

            //int maxindex = getMaxIndex(arr,int start,int last);
            int maxindex=getMaxIndex(arr,0,last);

        }

        return 0;
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[second]=temp;
    }
    static  int getMaxIndex(int arr[],int first,int second){
        int max=first;
        for (int i = 0; i <=second ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }

        }
        return -1;
    }

}
