import java.math.BigInteger;


public class Main {
    // Put outside both methods to be able to use.
    private static BigInteger[] cache;


    public static void main(String[] args) {
        int numberOfIts = 50;
        int sequence = numberOfIts;
        // Creating space inside the array to store values.
        cache = new BigInteger[numberOfIts + 1];

        System.out.println("The answer for sequence " + sequence + " is " + fib(numberOfIts));
    }

    // Return value of BigInteger instead
    private static BigInteger fib(int n) {

        if (n <= 1) {
            return BigInteger.valueOf(n); // instead of int is now BigInteger
        }

        if (cache[n] != 0) {
            return cache[n];
        }

        BigInteger tempCache = fib(n - 1).add(fib(n - 2)) ;
        cache[n] = tempCache;
        return tempCache;
    }
}