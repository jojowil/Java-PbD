public class FactorialRecurse {

    /**
     * Calculates factorial
     *
     * @param n represents n!
     * @return int result
     */
    public static int fact(int n) {

        if (n < 0)
            throw new IllegalArgumentException("Value cannot be negative.");

        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(0));
        System.out.println(fact(4));
        System.out.println(fact(15));
    }
}
