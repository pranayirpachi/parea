package Capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Java8FeaturesExample.java
public class Java8FeaturesExample {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using lambda expression to iterate through the list
        System.out.println("Using forEach with lambda:");
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Using streams and lambda to filter even numbers
        System.out.println("Using streams to filter even numbers:");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Using streams and lambda to compute the sum of squares
        System.out.println("Using streams to compute the sum of squares:");
        int sumOfSquares = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sumOfSquares);

        // Using functional interface and lambda for custom operation
        Operation addOperation = (a, b) -> a + b;
        System.out.println("Using functional interface for custom operation (addition): " + addOperation.operate(3, 4));
    }

    // Functional interface with a single abstract method
    @FunctionalInterface
    interface Operation {
        int operate(int a, int b);
    }
}
