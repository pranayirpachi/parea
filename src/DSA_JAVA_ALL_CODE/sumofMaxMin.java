package DSA_JAVA_ALL_CODE;

import java.util.*;
import java.util.Arrays;

public class sumofMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
