package Capgemini;

import java.util.Scanner;

public class CharCountQuestion {
    static  void read(String name){
        int c=1;
        StringBuilder stringBuffer = new StringBuilder();
       for(int i=1;i<name.length();i++){
           if(name.charAt(i)==name.charAt(i-1)){
               c++;
              // stringBuffer.append()
           }
           else {
               stringBuffer.append(name.charAt(i-1));
               stringBuffer.append(name.charAt(c));
               c=1;
           }
       }
       stringBuffer.append(name.length()-1);
       stringBuffer.append(c);
       System.out.println(stringBuffer.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name  = sc.next();
        read(name);
    }
}
