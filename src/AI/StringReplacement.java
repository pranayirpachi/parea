package AI;

import java.util.Scanner;

public class StringReplacement {
    public static void main(String[] args) {
        // Get user input for the string and the character to replace
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char charToReplace = scanner.next().charAt(0);

        // Check if the character exists in the string
        if (inputString.indexOf(charToReplace) != -1) {
            // Get user input for the numeric value to replace the character with
            System.out.print("Enter the numeric value to replace with: ");
            int replacementNumeric = scanner.nextInt();

            // Replace the character with the numeric value
            String resultString = inputString.replace(charToReplace, Character.forDigit(replacementNumeric, 10));

            // Print the result
            System.out.println("Original string: " + inputString);
            System.out.println("Result after replacement: " + resultString);
        } else {
            System.out.println("The character to replace was not found in the string.");
        }

        // Close the scanner
        scanner.close();
    }
}
