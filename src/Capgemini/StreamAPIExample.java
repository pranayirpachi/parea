package Capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {
        // Creating a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Frank");

        // Filtering names starting with 'A' and collecting them into a new list
        List<String> namesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Names starting with 'A': " + namesStartingWithA);

        // Converting names to uppercase using map
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase names: " + uppercaseNames);

        // Combining filtering and mapping: Names starting with 'F' in uppercase
        List<String> uppercaseNamesStartingWithF = names.stream()
                .filter(name -> name.startsWith("F"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase names starting with 'F': " + uppercaseNamesStartingWithF);

        // Counting the number of names with length greater than 4
        long count = names.stream()
                .filter(name -> name.length() > 4)
                .count();

        System.out.println("Number of names with length greater than 4: " + count);
    }
}
