package DSA_JAVA_ALL_CODE;

import java.util.Scanner;
class reas{
    public void name(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ar[] = new String[Integer.parseInt(name)];
        for (int i =0;i<name.length();i++){
            ar[i] = sc.nextLine();
        }
        for (int i = 0; i <ar.length ; i++) {


        }
//        StringBuffer stringBuffer = new StringBuffer(name);
//        stringBuffer.substring(name);
//        System.out.println(stringBuffer);

    }
}

public class reversestring {


    public static void main(String[] args) {
        reas r = new reas();
        r.name();


    }
}
