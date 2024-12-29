public class GettingStarted1 {

    /**
     * Method to compute a sum
     * @param a int value to be summed
     * @param b another int value to be summed
     * @return the sum of a and b
     */
    public static int sum(int a, int b) {

        int t;
        t = a + b;
        return t;
    }

    /**
     * Main method thats accepts an array of Strings.
     * @param args Strings from the command line
     */
    public static void main(String[] args) {

        int x;

        /* sum invoked here. */
        x = sum(2,5);
        System.out.println("The sum of 2 and 5 is " + x);
    }
}
