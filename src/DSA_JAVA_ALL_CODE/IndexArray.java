package DSA_JAVA_ALL_CODE;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class IndexArray {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = sc.nextInt();
        int high = sc.nextInt();
        int key = sc.nextInt();
        int mid = (low+high)/2;
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(key==mid){
                return A[i];
            }
            else if(key>=mid){
                high++;
                low--;
                return A[i];
            }
            else{
                high--;
                low++;
                return A[i];
            }
        }
        return n;




    }
}
