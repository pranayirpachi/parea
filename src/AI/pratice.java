package AI;

import java.util.Scanner;

public class pratice {

    public static void readname(){
        Scanner sc = new Scanner(
                System.in
        );
        System.out.println("enter a name is ");
        String name = sc.next();

        System.out.println("enter a replace character ");
        char replace_char = sc.next().charAt(0);

        if(name.indexOf(replace_char)!=-1){
            System.out.println("enter a digit you want to replaced");
            int digit = sc.nextInt();

            String replace = name.replace(replace_char,Character.forDigit(digit,10));

            System.out.println(" name of the character is apply where to see the function where we have to apply " +replace);


        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        readname();


    }
}
