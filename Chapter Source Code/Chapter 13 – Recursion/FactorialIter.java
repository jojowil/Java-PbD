public class FactorialIter {

    /**
     * Calculates factorial
     *
     * @param n represents n!
     * @return int result
     */
    public static int fact(int n) {
        int prod = 1;

        if (n < 0)
            throw new IllegalArgumentException("Value cannot be negative.");

        for (int i = n; i > 1; i--)
            prod = prod * i;

        return prod;
    }

    public static void main(String[] args) {
        System.out.println(fact(0));
        System.out.println(fact(4));
        System.out.println(fact(15));
    }
}
