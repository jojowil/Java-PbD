public class FibRecurse2 {

    static long fibcalls;

    public static int fib(int n) {

        fibcalls++;

        if ( n < 0 )
            throw new IllegalArgumentException("Value cannot be negative.");

        if ( n == 0 || n == 1 )
            return n;
        else
            return fib(n-1) + fib(n-2);
    }

    public static void main(String [] args) {
        fibcalls = 0;
        System.out.println(fib(1));
        System.out.println("fibcalls = " + fibcalls);

        fibcalls = 0;
        System.out.println(fib(4));
        System.out.println("fibcalls = " + fibcalls);

        fibcalls = 0;
        System.out.println(fib(46));
        System.out.println("fibcalls = " + fibcalls);
    }
}
