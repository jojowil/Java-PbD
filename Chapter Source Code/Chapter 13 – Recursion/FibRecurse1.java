public class FibRecurse1 {

    /**
     * Tail tree recursive Fibonacci
     *
     * @param n the nth number
     * @return int result
     */
    public static int fib(int n) {

        if (n < 0)
            throw new IllegalArgumentException("Value cannot be negative.");

        if (n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(46));
    }
}
