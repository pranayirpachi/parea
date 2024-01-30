package Capgemini;

import java.util.Locale;
import java.util.Scanner;

public class Diffrent_String {
    public void string(){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String n1 = sc.nextLine();
        for (int i = 0; i <n.length() ; i++) {
            for(int j=0;j<n1.length();j++){
                if(n.charAt(i)!=n1.charAt(j)){
                    System.out.println(n.charAt(i));
                }
            }

        }


    }

    public static void main(String[] args) {
        Diffrent_String string = new Diffrent_String();
        string.string();
    }
}
