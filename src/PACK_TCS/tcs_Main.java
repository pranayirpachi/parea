package PACK_TCS;
import java.util.HashMap;
import java.util.Scanner;

public class tcs_Main {
    public static void main(String[] args) {
        HashMap <Character,Integer> hashMap = new HashMap<>();
        hashMap.put('A',10);
        hashMap.put('B',11);
        hashMap.put('C',13);
        hashMap.put('D',14);
        hashMap.put('F',15);
        hashMap.put('G',16);
        hashMap.put('a',10);
        hashMap.put('b',11);
        hashMap.put('c',13);
        hashMap.put('d',14);
        hashMap.put('f',15);
        hashMap.put('g',16);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long num = 0;
        int k = 0;
        for (int i = s.length()-1; i >=0 ; i--) {

            if((s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z'));
            {
                num = num + hashMap.get(s.charAt(i)) * (int) Math.pow(17, k++);
            }
            {
                num = num+((s.charAt(i)-'0')*(int)Math.pow(17,k++));

            }

        }
        System.out.println(num);
    }
}
