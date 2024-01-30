package Accenture_Coding_Question_2023;
import java.util.Scanner;
import java.util.*;

public class JugsAndCups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCups = scanner.nextInt();
        int[] cupCapacities = new int[nCups];
        for (int i = 0; i < nCups; i++) {
            cupCapacities[i] = scanner.nextInt();
        }

        int jugCapacity = scanner.nextInt();

        // Sort the cup capacities in ascending order.
        Arrays.sort(cupCapacities);

        // Create a list to store the number of times each cup is used.
        int[] cupFrequencies = new int[nCups];

        // Initialize the current capacity of the jug.
        int currentJugCapacity = 0;

        // While the current capacity of the jug is less than the desired capacity:
        while (currentJugCapacity < jugCapacity) {
            // Iterate over the cup capacities, starting with the cup with the largest capacity.
            for (int i = nCups - 1; i >= 0; i--) {
                // If the current capacity of the jug plus the capacity of the current cup is less than or equal to the desired capacity:
                if (currentJugCapacity + cupCapacities[i] <= jugCapacity) {
                    // Add the capacity of the current cup to the current capacity of the jug.
                    currentJugCapacity += cupCapacities[i];

                    // Increment the number of times the current cup is used.
                    cupFrequencies[i]++;
                }

                // If the current capacity of the jug is equal to the desired capacity:
                if (currentJugCapacity == jugCapacity) {
                    break;
                }
            }
        }

        // If the current capacity of the jug is greater than the desired capacity:
        if (currentJugCapacity > jugCapacity) {
            System.out.println("The problem is not solvable.");
            return;
        }

        // Otherwise, the problem is solvable and the list of cups and the number of times each cup is used is the solution.
        System.out.println("The solution is:");
        for (int i = 0; i < nCups; i++) {
            if (cupFrequencies[i] > 0) {
                System.out.println(cupCapacities[i] + " " + cupFrequencies[i]);
            }
        }
    }
}
