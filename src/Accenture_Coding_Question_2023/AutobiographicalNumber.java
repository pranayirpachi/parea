package Accenture_Coding_Question_2023;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AutobiographicalNumber {

    public static int number(int n){
        int c=0;
        String s = Integer.toString(n);
        Set<Integer> ans = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(Character.getNumericValue(s.charAt(j))==i){
                    count++;
                }
            }
            if(!(Character.getNumericValue(s.charAt(i))==count)){
                return 0;

            }
            count=0;
            ans.add(Character.getNumericValue(s.charAt(i)));

        }
        return ans.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(number(n));

    }
}
