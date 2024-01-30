package DSA_JAVA_ALL_CODE;

import java.util.*;
import java.util.Arrays;

abstract class Arrays_All_Method {
    void read(){
        System.out.println("size of an array");
    }
    static class arrayshow extends Arrays_All_Method{
        void read(){
            System.out.println("read a size ");
        }

    }
    static class arraymul extends Arrays_All_Method{
        void read(){
            System.out.println("multiplication is :");
        }
    }



    public static void main(String[] args) {
        arrayshow c = new  arrayshow();
        c.read();
       arraymul as = new arraymul();
       as.read();
    }


}