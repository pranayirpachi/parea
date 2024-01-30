package Accenture_Coding_Question_2023;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimeConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger[] numbers = new BigInteger[n];
        BigInteger q = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextBigInteger();
            if (numbers[i].compareTo(q) < 0) {
                q = numbers[i];
            }
        }

        BigInteger p = q.add(BigInteger.ONE);

        while (p.compareTo(BigInteger.TEN.pow(10)) <= 0) {
            if (isPrime(p) && isSmallestRemainder(p, numbers, q)) {
                System.out.println(p);
                return;
            }
            p = p.add(BigInteger.ONE);
        }

        System.out.println("None");
    }

    public static boolean isPrime(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        if (num.compareTo(BigInteger.valueOf(3)) <= 0) {
            return true;
        }
        if (num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO) || num.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
            return false;
        }

        BigInteger i = BigInteger.valueOf(5);
        while (i.multiply(i).compareTo(num) <= 0) {
            if (num.mod(i).equals(BigInteger.ZERO) || num.mod(i.add(BigInteger.valueOf(2))).equals(BigInteger.ZERO)) {
                return false;
            }
            i = i.add(BigInteger.valueOf(6));
        }

        return true;
    }

    public static boolean isSmallestRemainder(BigInteger p, BigInteger[] numbers, BigInteger q) {
        for (BigInteger num : numbers) {
            if (!num.equals(q) && !p.mod(num).equals(q)) {
                return false;
            }
        }
        return true;
    }
}
