public class FibRecurse3 {

    static int fibcalls;

    /**
     * Calculate Fibonacci
     *
     * @param n the nth number
     * @return int result
     */
    public static int fib (int n) {
        return fib2(n, -1, 1);
    }

    /**
     * Tail linear recursive Fibonacci with call tracing
     *
     * @param n number to be found (reducing)
     * @param p previous number
     * @param c current number
     * @return int result
     */
    private static int fib2(int n, int p, int c) {
        fibcalls++;
        if ( n == 0 )
            return p + c;
        else
            return fib2(n-1, c, p+c);
    }

    public static void main(String [] args) {
        fibcalls = 0;
        System.out.println(fib(46));
        System.out.println("fibcalls = " + fibcalls);
    }
}
