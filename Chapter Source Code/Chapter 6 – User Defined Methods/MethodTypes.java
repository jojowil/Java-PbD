public class MethodTypes {

    // no parameters, no return
    public static void announce() {
        System.err.println("The process has begun!");
    }

    // one parameter, no return
    public static void print_error(String errstr) {
        System.err.printf("The program encountered a \"%s\" error.", errstr);
    }

    // no parms, has return
    public static int get_random() {
        return (int)(Math.random()*100 + 1);
    }

    // 2 parms and return
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

    /* main method */
    public static void main(String[] args) {
        announce();
        System.out.printf("%d%n", get_random());
        System.out.printf("%d\n", power(2,10));
        print_error("something terrible");
    }

}
