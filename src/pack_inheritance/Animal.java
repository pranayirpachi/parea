package pack_inheritance;

import java.util.Scanner;

public class Animal {
    public void show(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter a i");
        n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <2*i-1 ; j--) {
                System.out.println("%&%");

            }


        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Animal s = new Animal();
        s.show();
    }
}

