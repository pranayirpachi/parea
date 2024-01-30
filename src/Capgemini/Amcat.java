package Capgemini;

import java.util.Scanner;

public class Amcat {
    public static int twoString(String name){
        int c=0;

        for(int i=0;i<name.length();i++){
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)!=name.charAt(j)){
                    name.charAt(i);
                    c++;

                }
            }

        }
        return c;




    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        twoString(name);

    }
}
