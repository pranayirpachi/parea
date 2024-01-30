package Accenture;

import java.util.*;


public class VowelSort {


    public boolean vowels(char s){
        return s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String();
        char res[] = name.toCharArray();
        VowelSort vowelSort = new VowelSort();
        char s = sc.next().charAt(1);
        vowelSort.vowels(s);
        int sn=0;
        int e = name.length()-1;
        while(s<e){
            while(s<e && !vowelSort.vowels(name.charAt(sn))){
                sn++;
            }
            while(s<e && !vowelSort.vowels(name.charAt(e))){
                e--;
            }
            char temp = res[sn];
            res[sn]=res[sn];
            res[sn]=temp;
            sn++;
            e--;

        }
        System.out.println(res);

    }

}