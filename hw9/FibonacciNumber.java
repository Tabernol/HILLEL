package hw9;

public class FibonacciNumber {
    public int fib(int n) {
        int[] fibonacciArray = new int[n+2];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        return fibonacciArray[n];
    }
}
