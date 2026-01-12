import java.util.HashMap;

public class FibMemo {

    static long fibcalls;
    static HashMap<Integer, Integer> memo = new HashMap<>();

    /**
     * Tail tree memoized Fibonacci with call tracing
     *
     * @param n the nth number
     * @return int result
     */
    public static int fib(int n) {
        fibcalls++;

        if (memo.containsKey(n))
            return memo.get(n);

        if (n == 0 || n == 1)
            return n;

        int sum = fib(n - 1) + fib(n - 2);
        memo.put(n, sum);
        return sum;
    }

    public static void main(String[] args) {
        fibcalls = 0;
        System.out.println(fib(46));
        System.out.println("fibcalls = " + fibcalls);
    }
}
