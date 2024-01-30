package Accenture;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_Remainder {
    static String show(int n, int num){
        String res = "";
        int rem =num/n;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int qu = num%n;
        arrayList.add(qu);
        while(qu!=0){
            arrayList.add(qu%n);
            qu = qu/n;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            // Learn a formula where here is a code to write a decimal to base form in a code where here to used

            if(arrayList.get(i)>9){
                res = (char) (arrayList.get (i) - 9 + 64) + res;

            }
            else{
                res = arrayList.get (i) + res;
            }


        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int num = sc.nextInt();
        System.out.println(show(n,num));

    }
}
