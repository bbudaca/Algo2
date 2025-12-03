import java.util.ArrayList;
import java.util.List;

public class TP5 {

    public static void main(String[] args) {

    }

    private static int naiveFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return naiveFibonacci(n - 1) + naiveFibonacci(n - 2);
    }

    private static int bottomUpFibonacciDP (int n) {
        if (n <= 1) return 1;

        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[n];
    }

    private static int optimizedBottomUpFibonacciDP (int n) {
        if (n <= 1) return n;

        int previousResult = 0;
        int currentResult = 1;
        for (int i = 2; i <= n; i++) {
            int temp = previousResult + currentResult;
            previousResult = currentResult;
            currentResult = temp;
        }

        return currentResult;
    }

    private static int topDownFibonacciDP (int n, int[] tab) {
        if (n <= 1) return n;

        // Memoized case
        if (tab[n] != 0) return tab[n];

        // add new entry in memoization table that has not been found yet
        tab[n] = topDownFibonacciDP(n - 1, tab) + topDownFibonacciDP(n - 2, tab);

        return tab[n];
    }

    private static int climbStairCorrect(int n, int[] memo) {
        // Base case
        if (n == 0) return 1;

        // invalid case
        if (n < 0) return 0;

        // memoization, memo array is initialized with -1 values
        if (memo[n] != 0) return memo[n];

        // recursion
        memo[n] = climbStairCorrect(n - 1, memo) + climbStairCorrect(n - 2, memo) + climbStairCorrect(n - 3, memo);

        return memo[n];
    }

}

