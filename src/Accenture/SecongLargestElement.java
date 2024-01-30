package Accenture;

import java.util.Scanner;

/*
def LargeSmallSum(arr)

The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

Assumption:

All array elements are unique
Treat the 0th position as even
NOTE

Return 0 if array is empty
Return 0, if array length is 3 or less than 3
Example

Input

arr:3 2 1 7 5 4

Output

7

Explanation

Second largest among even position elements(1 3 5) is 3
Second smallest among odd position element is 4
Thus output is 3+4 = 7
Sample Input

arr:1 8 0 2 3 5 6

Sample Output

8
 */

public class SecongLargestElement {
    static int ArraysInt(int arr[],int num){
        int iseven = 0;
        int isodd = 0;

        if(arr==null){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                iseven = iseven + i;
                System.out.println(i);
            }
            else {

                isodd = isodd + 1;
                System.out.println(i);
            }
        }

        return iseven+isodd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(ArraysInt(arr, arr.length));
    }
}

