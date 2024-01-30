package Accenture;

import java.util.Scanner;

public class SubArray {

    public static int Sum(int[] arr, int num) {
        // Check if the array is empty.
        if (arr == null) {
            return 0;
        }

        // Initialize the variables for the second largest element from the even and odd locations.
        int secondLargestEven = arr[0];
        int secondLargestOdd = arr[1];

        // Iterate through the array, starting at the second element.
        for (int i = 2; i < num; i++) {
            // If the current element is at an even location and is larger than the current second largest even element, update the second largest even element.
            if (i % 2 == 0 && arr[i] > secondLargestEven) {
                secondLargestEven = arr[i];
            }

            // If the current element is at an odd location and is larger than the current second largest odd element, update the second largest odd element.
            if (i % 2 == 1 && arr[i] > secondLargestOdd) {
                secondLargestOdd = arr[i];
            }
        }

        // Return the sum of the second largest even and odd elements.
        return secondLargestEven + secondLargestOdd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Sum(arr, num));
    }
}
