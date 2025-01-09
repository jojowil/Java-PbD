public class FibRecurse3 {

    static int fibcalls;

    public static int fib (int n) {
        return fib2(n, -1, 1);
    }

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
