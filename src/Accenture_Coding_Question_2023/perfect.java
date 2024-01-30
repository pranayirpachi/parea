package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class perfect {

    public static int read(String name){
        int count=0;

        int current=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='L'){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                current++;
            }
        }
        return current;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        read(name);


    }
}
