public class FibIter {

    public static int fib(int n) {

        if ( n < 0 )
            throw new IllegalArgumentException("Value cannot be negative.");

        int previous = -1;
        int current = 1;

        for (int i = 0; i <= n; i++) {
            int sum = current + previous;
            previous = current;
            current = sum;
        }
        return current;
    }

    public static void main(String [] args) {
        System.out.println(fib(46));
    }
}
