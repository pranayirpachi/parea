package PACK_TCS;

import java.util.Scanner;

public class TCS1 {
    public static void main(String[] args) {
        String str1[] = {"break","continue","case","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
        int flag = 0 ; // false
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i <16 ; i++) {
            if(str1[i].equals(input)){
                flag = 1;
                break;

            }

        }
        if(flag==1){
            System.out.println(input+" is a keyword");
        }
        else{
            System.out.println(input+ " is not a keyword ");
        }
    }
}
