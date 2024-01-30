package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class Round_Number {

    public static boolean number(int n){
        int slow = n;
        int fast =  n;

        do{
            slow = (int) Math.sqrt(slow);
            fast = (int) Math.sqrt(Math.sqrt(fast));


        }while (slow!=fast);
        if(slow==1){
            return  true;
        }
        else{
           return false;
        }

    }
    public static int sqare(int n){
        int sum=0;
        while (n != 0) {
            int digit = n%10;
            sum = sum + digit*digit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number(n);
        sqare(n);
    }
}
