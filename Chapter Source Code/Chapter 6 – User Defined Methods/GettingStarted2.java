public class GettingStarted2 {

    /**
     * Method to compute a sum
     *
     * @param potato int value to be summed
     * @param guava  another int value to be summed
     * @return the sum of potato and guava
     */
    public static int sum(int potato, int guava) {

        int pickle;
        pickle = potato + guava;
        return pickle;
    }

    /**
     * Main method thats accepts an array of Strings.
     *
     * @param args Strings from the command line
     */
    public static void main(String[] args) {

        int x;

        /* sum invoked here. */
        x = sum(2, 5);
        System.out.println("The sum of 2 and 5 is " + x);
    }
}
