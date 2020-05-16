package interview.needscleanup;

public class NthFibonacciNumber {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + ", ");
        }
        System.out.println(fib(10));
    }

    private static int fib(int i) {
        if (i <= 1) {
            return i;
        }
        return fib(i - 1) + fib(i - 2);
    }
}
