package Accenture;

import java.util.Scanner;

public class DivisiblebySix {
    static int sumdiffrence(int a,int b){
        int sum_is_divible_by=0;
        int sum_is_not_divible_by = 0;
        for(int i=0;i<=a;i++){
            if(i%b==0){
                sum_is_divible_by++;
            }
            else{
                sum_is_not_divible_by++;
            }

        }
        return Math.abs(sum_is_divible_by-sum_is_not_divible_by);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumdiffrence(a,b));



    }
}
