package Accenture;

import javax.imageio.IIOException;
import java.math.BigInteger;
import java.util.Scanner;



public class Coins{
    String n = "12";
    String n1 = "23";
    int ans = Integer.parseInt(n);
    BigInteger a = new BigInteger(n);
    BigInteger b = new BigInteger(n1);

    void son(){
        System.out.println("bad");
    }
    public class show extends Coins{
        void son(){
            System.out.println("sun");
        }
    }

    public static void main(String[] args) {
        //show as = new show()
    }
}
