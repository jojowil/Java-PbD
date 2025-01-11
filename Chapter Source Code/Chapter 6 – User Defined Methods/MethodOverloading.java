public class MethodOverloading {

    /**
     * Prints an error to stderr
     *
     * @param errstr Error message to be printed
     */
    public static void print_error(String errstr) {
        System.err.printf("The program encountered a \"%s\" error.", errstr);
    }

    /**
     * Prints default unknown error to stderr
     */
    public static void print_error() {
        System.err.println("The program encountered an unknown error.");
    }

    /**
     * Return random number 1-100 inclusive
     *
     * @return int random number
     */
    public static int get_random() {
        return (int) (Math.random() * 100 + 1);
    }

    /**
     * Return random number 1-top inclusive
     *
     * @param top max value for the random number
     * @return int random number
     */
    public static int get_random(int top) {
        return (int) (Math.random() * top + 1);
    }

    public static void main(String[] args) {

        System.out.printf("%d%n", get_random());
        System.out.printf("%d%n", get_random(50));
        print_error();
        print_error("something terrible");

    }
}
