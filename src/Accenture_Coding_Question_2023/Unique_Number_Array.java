package Accenture_Coding_Question_2023;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class  Unique_Number_Array {

    public static String array(int[][] matrix, int num) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for (int i = 0; i < num; i++) {
            row.clear();
            col.clear();
            for(int j=0;j<num;j++){
                row.add(matrix[i][j]);
                col.add(matrix[j][j]);
            }
            if(row.size()!=num || col.size()!=num){
                return "false";
            }


        }
        return "true";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int matrix[][] = new int[num][num];
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println(array(matrix,num));
    }
}
