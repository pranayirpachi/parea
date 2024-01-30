package Accenture;

import java.math.BigInteger;
import java.util.Scanner;

public class productString {

    public String multiplyStrings(String s1, String s2)
    {
        //code here.
        BigInteger bigInteger = new BigInteger(s1);
        BigInteger bigInteger1 = new BigInteger(s2);
        BigInteger product = bigInteger.multiply(bigInteger1);

        String ans = product.toString();
        return ans;




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        productString productString = new productString();
        productString.multiplyStrings(name1,name2);



    }
}
