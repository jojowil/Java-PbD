public class UsingArrays1 {

    /**
     * Method to sum the complete array.
     *
     * @param array integer array
     * @return integer sum
     */
    public static int sum(int[] array) {

        int x, sum = 0;

        for ( x = 0; x < array.length; x++)
            sum = sum + array[x];

        return sum;
    }

    /**
     * Methods to sum only the values in use.
     *
     * @param array integer array
     * @param inuse number of values used
     * @return
     */
    public static int sum(int[] array, int inuse) {

        int x, sum = 0;

        for ( x = 0; x < inuse; x++)
            sum = sum + array[x];

        return sum;
    }

    public static void main(String[] args) {

        int x, ia[] = new int[10], sum = 0, inuse = 5;

        // This code uses the full length of the array.
        for ( x = 0; x < ia.length; x++ ) {
            ia[x] = (int)(Math.random() * 100 + 1);
            sum = sum + ia[x];
        }

        System.out.println("The sum of random numbers is " + sum);
        System.out.println("The call to sum(ia) returns " + sum(ia));
        System.out.println("The call to sum(ia, 10) returns " + sum(ia, 10));

        /* This section uses only half the array and
         * demonstrates the need to keep the number
         * of elements in use.
         */
        sum = 0;

        for ( x = 0; x < inuse; x++ ) {
            ia[x] = (int)(Math.random() * 100 + 1);
            sum = sum + ia[x];
        }

        System.out.println("\nThe sum of random numbers is " + sum);
        System.out.println("The call to sum(ia) returns " + sum(ia));
        System.out.println("The call to sum(ia, inuse) returns " + sum(ia, inuse));
    }
}
