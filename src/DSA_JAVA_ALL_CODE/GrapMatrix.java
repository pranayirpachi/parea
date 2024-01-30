package DSA_JAVA_ALL_CODE;

import java.util.Scanner;

public class GrapMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int arr[] = new int[n];
            int count = 0;
            for(int j=0;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(s.charAt(j)==s.charAt(k)){
                        count = count + 1;
                    }
                }
            }
            if(count>0){
                System.out.println(n-2);
            }
            else{
                System.out.println(-1);
            }

        }

    }

}
