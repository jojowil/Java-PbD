public class MethodTypes {

    /**
     * Simple announcement.
     * no parameters, no return
     */
    public static void announce() {
        System.err.println("The process has begun!");
    }

    /**
     * Prints an error to stderr
     * one parameter, no return
     * @param errstr Error message to be printed
     */
    public static void print_error(String errstr) {
        System.err.printf("The program encountered a \"%s\" error.", errstr);
    }

    /**
     * Return random number 1-100 inclusive
     * no parms, has return
     * @return int random number
     */
    public static int get_random() {
        return (int)(Math.random()*100 + 1);
    }

    // 2 parms and return

    /**
     * Raises base to a power.
     * 2 parms and return
     * @param base number to have exponent applied
     * @param pwr the power to raise base
     * @return
     */
    public static int power(int base, int pwr) {
        int x, total=1;
        if ( pwr == 0 )
            return 1;
        else {
            for ( x = 1; x <= pwr; x++ )
                total *= base;
        }
        return total;
    }

    public static void main(String[] args) {
        announce();
        System.out.printf("%d%n", get_random());
        System.out.printf("%d\n", power(2,10));
        print_error("something terrible");
    }

}
