package Accenture;

import java.util.Scanner;
import java.util.Stack;

public class CurlyBrush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> an = new Stack<>();
        for (int i = 0; i < an.size(); i++) {
            if(an.get(i) =='}'){
                an.push(an.get(i));
            }
            else{
                if(an.isEmpty()){
                    System.out.println("failed");
                }
                else{
                    an.pop();
                }
            }
        }




    }
}
