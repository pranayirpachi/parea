package DSA_JAVA_ALL_CODE;

import java.util.Scanner;
import java.util.Stack;

public class question {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sd.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
           // Arraylist<Integer> arraylist = new Arraylist<>();
            Stack<Integer> stack = new Stack<>();

            if(a[i]>0 && a[i+1]<0){
                stack.pop();
            }
            else{
                //System.out.println(a[i]);
               int as = stack.push(a[i]);
                System.out.println(as);
            }


        }

    }
}
